package com.github.martinfrank.eoblegacy.view;


import com.github.martinfrank.maplib2.geo.DiscreetPoint;

public enum ViewPortPosition{

    thirdRowLeftThird(new DiscreetPoint(-3,-2)),
    THIRD_ROW_VERY_LEFT(new DiscreetPoint(-2,-2)),
    THIRD_ROW_LEFT(new DiscreetPoint(-1,-2)),
    THIRD_ROW_CENTER(new DiscreetPoint(0,-2)),
    THIRD_ROW_RIGHT(new DiscreetPoint(1,-2)),
    THIRD_ROW_VERY_RIGHT(new DiscreetPoint(2,-2)),
    thirdRowRightThird(new DiscreetPoint(3,-2)),

    SECOND_ROW_VERY_LEFT(new DiscreetPoint(-2,-1)),
    SECOND_ROW_LEFT(new DiscreetPoint(-1,-1)),
    SECOND_ROW_CENTER(new DiscreetPoint(0,-1)),
    SECOND_ROW_RIGHT(new DiscreetPoint(1,-1)),
    SECOND_ROW_VERY_RIGHT(new DiscreetPoint(2,-1)),


    FIRST_ROW_LEFT(new DiscreetPoint(-1,0)),
    FIRST_ROW_CENTER(new DiscreetPoint(0,0)),
    FIRST_ROW_RIGHT(new DiscreetPoint(1,0));

    public final DiscreetPoint relativePosition;
    ViewPortPosition(DiscreetPoint relativePosition){
        this.relativePosition = relativePosition;
    }

    @Override
    public String toString() {
        return "ViewPortPosition{" +
                "relativePosition=" + relativePosition +
                '}';
    }
}
