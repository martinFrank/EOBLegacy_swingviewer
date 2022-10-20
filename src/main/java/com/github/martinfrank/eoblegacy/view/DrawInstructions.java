package com.github.martinfrank.eoblegacy.view;

import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;
import com.github.martinfrank.eoblegacy.resources.ImageId;
import com.github.martinfrank.eoblegacy.resources.TileClipping;
import com.github.martinfrank.eoblegacy.resources.TileLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DrawInstructions {

    private final Map<ViewPortPosition, EobLegacyMapField> viewPort;

    public DrawInstructions(Map<ViewPortPosition, EobLegacyMapField> viewPort) {
        this.viewPort = viewPort;
    }

    public List<DrawInstruction> getDrawOrder() {
        List<DrawInstruction> drawInstructions = new ArrayList<>();

        addThirdRow(drawInstructions);
        addSecondRow(drawInstructions);
        addFirstRow(drawInstructions);

        return drawInstructions;
    }


    private void addThirdRow(List<DrawInstruction> drawInstructions) {
        //third row very left
        if (isSolid(ViewPortPosition.THIRD_ROW_VERY_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.THIRD_ROW_VERY_LEFT,
                    TileLocation.THIRD_ROW_VERY_LEFT));
        }
        if (isEmpty(ViewPortPosition.THIRD_ROW_VERY_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.THIRD_ROW_VERY_LEFT,
                    TileLocation.THIRD_ROW_VERY_LEFT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.THIRD_ROW_VERY_LEFT,
                    TileLocation.THIRD_ROW_VERY_LEFT));
        }

        //third row very right
        if (isSolid(ViewPortPosition.THIRD_ROW_VERY_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.THIRD_ROW_VERY_RIGHT,
                    TileLocation.THIRD_ROW_VERY_RIGHT));
        }
        if (isEmpty(ViewPortPosition.THIRD_ROW_VERY_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.THIRD_ROW_VERY_RIGHT,
                    TileLocation.THIRD_ROW_VERY_RIGHT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.THIRD_ROW_VERY_RIGHT,
                    TileLocation.THIRD_ROW_VERY_RIGHT));
        }

        //third row left
        if (isSolid(ViewPortPosition.THIRD_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.THIRD_ROW_LEFT,
                    TileLocation.THIRD_ROW_LEFT));
        }
        if (isEmpty(ViewPortPosition.THIRD_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.THIRD_ROW_LEFT,
                    TileLocation.THIRD_ROW_LEFT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.THIRD_ROW_LEFT,
                    TileLocation.THIRD_ROW_LEFT));
        }

        //third row right
        if (isSolid(ViewPortPosition.THIRD_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.THIRD_ROW_RIGHT,
                    TileLocation.THIRD_ROW_RIGHT));
        }
        if (isEmpty(ViewPortPosition.THIRD_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.THIRD_ROW_RIGHT,
                    TileLocation.THIRD_ROW_RIGHT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.THIRD_ROW_RIGHT,
                    TileLocation.THIRD_ROW_RIGHT));
        }

        //third row center
        if (isSolid(ViewPortPosition.THIRD_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.THIRD_ROW_CENTER,
                    TileLocation.THIRD_ROW_CENTER));
        }
        if (isEmpty(ViewPortPosition.THIRD_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.THIRD_ROW_CENTER,
                    TileLocation.THIRD_ROW_CENTER));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.THIRD_ROW_CENTER,
                    TileLocation.THIRD_ROW_CENTER));
        }
    }

    private void addSecondRow(List<DrawInstruction> drawInstructions) {
        //second row very right
        if (isSolid(ViewPortPosition.SECOND_ROW_VERY_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.SECOND_ROW_VERY_LEFT,
                    TileLocation.SECOND_ROW_VERY_LEFT));
        }
        if (isEmpty(ViewPortPosition.SECOND_ROW_VERY_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.SECOND_ROW_VERY_LEFT,
                    TileLocation.SECOND_ROW_VERY_LEFT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.SECOND_ROW_VERY_LEFT,
                    TileLocation.SECOND_ROW_VERY_LEFT));
        }

        //second row very right
        if (isSolid(ViewPortPosition.SECOND_ROW_VERY_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.SECOND_ROW_VERY_RIGHT,
                    TileLocation.SECOND_ROW_VERY_RIGHT));
        }
        if (isEmpty(ViewPortPosition.SECOND_ROW_VERY_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.SECOND_ROW_VERY_RIGHT,
                    TileLocation.SECOND_ROW_VERY_RIGHT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.SECOND_ROW_VERY_RIGHT,
                    TileLocation.SECOND_ROW_VERY_RIGHT));
        }

        //second row left
        if (isSolid(ViewPortPosition.SECOND_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.SECOND_ROW_LEFT,
                    TileLocation.SECOND_ROW_LEFT));
        }
        if (isEmpty(ViewPortPosition.SECOND_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.SECOND_ROW_LEFT,
                    TileLocation.SECOND_ROW_LEFT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.SECOND_ROW_LEFT,
                    TileLocation.SECOND_ROW_LEFT));
        }

        //second row right
        if (isSolid(ViewPortPosition.SECOND_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.SECOND_ROW_RIGHT,
                    TileLocation.SECOND_ROW_RIGHT));
        }
        if (isEmpty(ViewPortPosition.SECOND_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.SECOND_ROW_RIGHT,
                    TileLocation.SECOND_ROW_RIGHT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.SECOND_ROW_RIGHT,
                    TileLocation.SECOND_ROW_RIGHT));
        }

        //second row center
        if (isSolid(ViewPortPosition.SECOND_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.SECOND_ROW_CENTER,
                    TileLocation.SECOND_ROW_CENTER));
        }
        if (isEmpty(ViewPortPosition.SECOND_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.SECOND_ROW_CENTER,
                    TileLocation.SECOND_ROW_CENTER));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.SECOND_ROW_CENTER,
                    TileLocation.SECOND_ROW_CENTER));
        }
    }

    private void addFirstRow(List<DrawInstruction> drawInstructions) {
        //first row left
        if (isSolid(ViewPortPosition.FIRST_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.FIRST_ROW_LEFT,
                    TileLocation.FIRST_ROW_LEFT));
        }
        if (isEmpty(ViewPortPosition.FIRST_ROW_LEFT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.FIRST_ROW_LEFT,
                    TileLocation.FIRST_ROW_LEFT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.FIRST_ROW_LEFT,
                    TileLocation.FIRST_ROW_LEFT));
        }

        //first row right
        if (isSolid(ViewPortPosition.FIRST_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.FIRST_ROW_RIGHT,
                    TileLocation.FIRST_ROW_RIGHT));
        }
        if (isEmpty(ViewPortPosition.FIRST_ROW_RIGHT)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.FIRST_ROW_RIGHT,
                    TileLocation.FIRST_ROW_RIGHT));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.FIRST_ROW_RIGHT,
                    TileLocation.FIRST_ROW_RIGHT));
        }

        //first row center
        if (isSolid(ViewPortPosition.FIRST_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_WALL,
                    TileClipping.FIRST_ROW_CENTER,
                    TileLocation.FIRST_ROW_CENTER));
        }
        if (isEmpty(ViewPortPosition.FIRST_ROW_CENTER)) {
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_CEILING,
                    TileClipping.FIRST_ROW_CENTER,
                    TileLocation.FIRST_ROW_CENTER));
            drawInstructions.add(new DrawInstruction(
                    ImageId.DUNGEON_FLOOR,
                    TileClipping.FIRST_ROW_CENTER,
                    TileLocation.FIRST_ROW_CENTER));
        }
    }

    private boolean isEmpty(ViewPortPosition position) {
        EobLegacyMapField field = viewPort.get(position);
        return field != null && !field.isSolid();
    }

    private boolean isSolid(ViewPortPosition position) {
        EobLegacyMapField field = viewPort.get(position);
        return field == null || field.isSolid();
    }
}
