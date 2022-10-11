package com.github.martinfrank.eoblegacy.view;

import com.github.martinfrank.eoblegacy.map.DemoMap;
import com.github.martinfrank.eoblegacy.map.DemoMapField;
import com.github.martinfrank.eoblegacy.model.*;
import com.github.martinfrank.geolib.GeoPoint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HeroView {

    private final Map<ViewPortPosition, DemoMapField> viewPort = new HashMap<>();

    public void create(DemoMap demoMap, Hero hero) {
        GeoPoint center = hero.getField().getIndex();
        List<GeoPoint> absolutPositions = calculateAbsolutePositions(hero.getLookingDirection(), center);
        ViewPortPosition[] viewPortPositions = ViewPortPosition.values();
        for (int i = 0; i < viewPortPositions.length; i++) {
            viewPort.put(viewPortPositions[i], demoMap.getField(absolutPositions.get(i).getX(), absolutPositions.get(i).getY()));
        }
    }

    private List<GeoPoint> calculateAbsolutePositions(Direction lookingDirection, GeoPoint center) {
        return Arrays.stream(ViewPortPosition.values())
                .map(p -> mapWithDirection(lookingDirection, center, p)).collect(Collectors.toList());
    }

    private GeoPoint mapWithDirection(Direction lookingDirection, GeoPoint center, ViewPortPosition viewPortPosition) {
        switch (lookingDirection) {
            case NORTH:
                return new GeoPoint(
                        center.getX() + viewPortPosition.relativePosition.getX(),
                        center.getY() + viewPortPosition.relativePosition.getY()
                );
            case EAST:
                return new GeoPoint(
                        center.getX() - viewPortPosition.relativePosition.getY(),
                        center.getY() + viewPortPosition.relativePosition.getX()
                );
            case SOUTH:
                return new GeoPoint(
                        center.getX() - viewPortPosition.relativePosition.getX(),
                        center.getY() - viewPortPosition.relativePosition.getY()
                );
            case WEST:
                return new GeoPoint(
                        center.getX() + viewPortPosition.relativePosition.getY(),
                        center.getY() - viewPortPosition.relativePosition.getX()
                );
            default:
                throw new IllegalArgumentException();
        }
    }

    public Map<ViewPortPosition,DemoMapField> getViewPortFields() {
        return viewPort;
    }

    public boolean isEmpty(ViewPortPosition position) {
        DemoMapField field = getViewPortFields().get(position);
        return field != null && !field.isSolid();
    }

    public boolean isSolid(ViewPortPosition position) {
        DemoMapField field = getViewPortFields().get(position);
        return field == null || field.isSolid();
    }

    public DrawInstructions getDrawInstructions() {
        return new DrawInstructions(viewPort);
    }
}
