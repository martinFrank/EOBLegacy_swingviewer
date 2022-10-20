package com.github.martinfrank.eoblegacy.view;


import com.github.martinfrank.maplib2.geo.Point;

public enum ViewPortPosition{

    thirdRowLeftThird(new Point(-3,-2)),
    THIRD_ROW_VERY_LEFT(new Point(-2,-2)),
    THIRD_ROW_LEFT(new Point(-1,-2)),
    THIRD_ROW_CENTER(new Point(0,-2)),
    THIRD_ROW_RIGHT(new Point(1,-2)),
    THIRD_ROW_VERY_RIGHT(new Point(2,-2)),
    thirdRowRightThird(new Point(3,-2)),

    SECOND_ROW_VERY_LEFT(new Point(-2,-1)),
    SECOND_ROW_LEFT(new Point(-1,-1)),
    SECOND_ROW_CENTER(new Point(0,-1)),
    SECOND_ROW_RIGHT(new Point(1,-1)),
    SECOND_ROW_VERY_RIGHT(new Point(2,-1)),


    FIRST_ROW_LEFT(new Point(-1,0)),
    FIRST_ROW_CENTER(new Point(0,0)),
    FIRST_ROW_RIGHT(new Point(1,0));

    public final Point relativePosition;
    ViewPortPosition(Point relativePosition){
        this.relativePosition = relativePosition;
    }

    @Override
    public String toString() {
        return "ViewPortPosition{" +
                "relativePosition=" + relativePosition +
                '}';
    }
}
