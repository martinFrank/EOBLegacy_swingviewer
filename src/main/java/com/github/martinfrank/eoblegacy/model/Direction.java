package com.github.martinfrank.eoblegacy.model;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction rotate(Direction current, Rotation rotation) {
        switch (current){
            case NORTH: return rotation==Rotation.CLOCKWISE?Direction.EAST:Direction.WEST;
            case EAST: return rotation==Rotation.CLOCKWISE?Direction.SOUTH:Direction.NORTH;
            case SOUTH: return rotation==Rotation.CLOCKWISE?Direction.WEST:Direction.EAST;
            case WEST: return rotation==Rotation.CLOCKWISE?Direction.NORTH:Direction.SOUTH;
            default: throw new IllegalStateException();
        }
    }

    public static Direction opposite(Direction current){
        switch (current){
            case NORTH : return SOUTH;
            case EAST : return WEST;
            case SOUTH : return NORTH;
            case WEST : return EAST;
            default: throw new IllegalStateException();
        }
    }

    public static int getDy(Direction current, MoveDirection moveDirection) {
        switch (current){
            case NORTH : return moveDirection == MoveDirection.FORWARD ? -1 : 1;
            case EAST : return 0;
            case SOUTH : return moveDirection == MoveDirection.FORWARD ? 1 : -1;
            case WEST : return 0;
            default: throw new IllegalStateException();
        }
    }

    public static int getDx(Direction current, MoveDirection moveDirection) {
        switch (current){
            case NORTH : return 0;
            case EAST : return moveDirection == MoveDirection.FORWARD ? 1 : -1;
            case SOUTH : return 0;
            case WEST : return moveDirection == MoveDirection.FORWARD ? -1 : 1;
            default: throw new IllegalStateException();
        }
    }
}
