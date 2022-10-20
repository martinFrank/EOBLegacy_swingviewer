package com.github.martinfrank.eoblegacy.view;

import com.github.martinfrank.eoblegacy.map.EobLegacyMap;
import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;
import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Hero;
import com.github.martinfrank.maplib2.geo.Point;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HeroView {

    private final Map<ViewPortPosition, EobLegacyMapField> viewPort = new HashMap<>();

    public void create(EobLegacyMap eobLegacyMap, Hero hero) {
        Point center = hero.getField().position;
        List<Point> absolutPositions = calculateAbsolutePositions(hero.getLookingDirection(), center);
        ViewPortPosition[] viewPortPositions = ViewPortPosition.values();
        for (int i = 0; i < viewPortPositions.length; i++) {
            viewPort.put(viewPortPositions[i], eobLegacyMap.fields.getField(absolutPositions.get(i).x, absolutPositions.get(i).y));
        }
    }

    private List<Point> calculateAbsolutePositions(Direction lookingDirection, Point center) {
        return Arrays.stream(ViewPortPosition.values())
                .map(p -> mapWithDirection(lookingDirection, center, p)).collect(Collectors.toList());
    }

    private Point mapWithDirection(Direction lookingDirection, Point center, ViewPortPosition viewPortPosition) {
        switch (lookingDirection) {
            case NORTH:
                return new Point(
                        center.x + viewPortPosition.relativePosition.x,
                        center.y + viewPortPosition.relativePosition.y
                );
            case EAST:
                return new Point(
                        center.x - viewPortPosition.relativePosition.y,
                        center.y + viewPortPosition.relativePosition.x
                );
            case SOUTH:
                return new Point(
                        center.x - viewPortPosition.relativePosition.x,
                        center.y - viewPortPosition.relativePosition.y
                );
            case WEST:
                return new Point(
                        center.x + viewPortPosition.relativePosition.y,
                        center.y - viewPortPosition.relativePosition.x
                );
            default:
                throw new IllegalArgumentException();
        }
    }

    public Map<ViewPortPosition, EobLegacyMapField> getViewPortFields() {
        return viewPort;
    }

    public boolean isEmpty(ViewPortPosition position) {
        EobLegacyMapField field = getViewPortFields().get(position);
        return field != null && !field.isSolid();
    }

    public boolean isSolid(ViewPortPosition position) {
        EobLegacyMapField field = getViewPortFields().get(position);
        return field == null || field.isSolid();
    }

    public DrawInstructions getDrawInstructions() {
        return new DrawInstructions(viewPort);
    }
}
