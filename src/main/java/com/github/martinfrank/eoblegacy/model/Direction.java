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
            case NORTH : return getDyFacingNorth(moveDirection);
            case EAST : return getDyFacingEast(moveDirection);
            case SOUTH : return getDyFacingSouth(moveDirection);
            case WEST : return getDyFacingWest(moveDirection);
            default: throw new IllegalStateException();
        }
    }

    private static int getDyFacingEast(MoveDirection moveDirection) {
        switch(moveDirection){
            case STRAFE_LEFT: return -1;
            case STRAFE_RIGHT: return 1;
            default:return 0;
        }
    }

    private static int getDyFacingWest(MoveDirection moveDirection) {
        switch(moveDirection){
            case STRAFE_LEFT: return 1;
            case STRAFE_RIGHT: return -1;
            default:return 0;
        }
    }

    private static int getDyFacingSouth(MoveDirection moveDirection) {
        switch(moveDirection){
            case FORWARD: return 1;
            case BACKWARD: return -1;
            default:return 0;
        }
    }

    private static int getDyFacingNorth(MoveDirection moveDirection) {
        switch(moveDirection){
            case FORWARD: return -1;
            case BACKWARD: return 1;
            default:return 0;
        }
    }

    public static int getDx(Direction current, MoveDirection moveDirection) {
        switch (current){
            case NORTH : return getDxFacingNorth(moveDirection);
            case EAST : return getDxFacingEast(moveDirection);
            case SOUTH : return getDxFacingSouth(moveDirection);
            case WEST : return getDxFacingWest(moveDirection);
            default: throw new IllegalStateException();
        }
    }

    private static int getDxFacingWest(MoveDirection moveDirection) {
        switch(moveDirection){
            case FORWARD: return -1;
            case BACKWARD: return 1;
            default:return 0;
        }
    }

    private static int getDxFacingSouth(MoveDirection moveDirection) {
        switch(moveDirection){
            case STRAFE_LEFT: return 1;
            case STRAFE_RIGHT: return -1;
            default:return 0;
        }
    }

    private static int getDxFacingEast(MoveDirection moveDirection) {
        switch(moveDirection){
            case FORWARD: return 1;
            case BACKWARD: return -1;
            default:return 0;
        }
    }

    private static int getDxFacingNorth(MoveDirection moveDirection) {
        switch(moveDirection){
            case STRAFE_LEFT: return -1;
            case STRAFE_RIGHT: return 1;
            default:return 0;
        }
    }
}
