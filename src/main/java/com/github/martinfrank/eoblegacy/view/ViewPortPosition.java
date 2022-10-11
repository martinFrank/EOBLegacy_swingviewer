package com.github.martinfrank.eoblegacy.view;

import com.github.martinfrank.geolib.GeoPoint;

public enum ViewPortPosition{

    thirdRowLeftThird(new GeoPoint(-3,-2)),
    THIRD_ROW_VERY_LEFT(new GeoPoint(-2,-2)),
    THIRD_ROW_LEFT(new GeoPoint(-1,-2)),
    THIRD_ROW_CENTER(new GeoPoint(0,-2)),
    THIRD_ROW_RIGHT(new GeoPoint(1,-2)),
    THIRD_ROW_VERY_RIGHT(new GeoPoint(2,-2)),
    thirdRowRightThird(new GeoPoint(3,-2)),

    SECOND_ROW_VERY_LEFT(new GeoPoint(-2,-1)),
    SECOND_ROW_LEFT(new GeoPoint(-1,-1)),
    SECOND_ROW_CENTER(new GeoPoint(0,-1)),
    SECOND_ROW_RIGHT(new GeoPoint(1,-1)),
    SECOND_ROW_VERY_RIGHT(new GeoPoint(2,-1)),


    FIRST_ROW_LEFT(new GeoPoint(-1,0)),
    FIRST_ROW_CENTER(new GeoPoint(0,0)),
    FIRST_ROW_RIGHT(new GeoPoint(1,0));

    public final GeoPoint relativePosition;
    ViewPortPosition(GeoPoint relativePosition){
        this.relativePosition = relativePosition;
    }

    @Override
    public String toString() {
        return "ViewPortPosition{" +
                "relativePosition=" + relativePosition +
                '}';
    }
}
