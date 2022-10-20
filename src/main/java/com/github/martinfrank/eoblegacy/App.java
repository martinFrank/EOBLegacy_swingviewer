package com.github.martinfrank.eoblegacy;


import com.github.martinfrank.eoblegacy.map.EobLegacyMapEdge;
import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;
import com.github.martinfrank.eoblegacy.map.EobLegacyMapNode;
import com.github.martinfrank.eoblegacy.map.EobLegacyMapPartFactory;
import com.github.martinfrank.maplib2.generate.MapGenerationParameter;
import com.github.martinfrank.maplib2.generate.MapGenerator;
import com.github.martinfrank.maplib2.map.Map;
import com.github.martinfrank.maplib2.map.MapStyle;
import com.github.martinfrank.maplib2.maze.MazeAlgorithmType;
import com.github.martinfrank.maplib2.maze.MazeGenerationParams;
import com.github.martinfrank.maplib2.maze.MazeGenerator;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    private void start() {

        MapGenerationParameter parameter = MapGenerationParameter.newBuilder().width(64).height(64)
                .mapStyle(MapStyle.SQUARE).build();

        EobLegacyMapPartFactory factory = new EobLegacyMapPartFactory();
        Map<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> map = MapGenerator.generate(parameter, factory);

        MazeGenerationParams params = MazeGenerationParams.newBuilder().algorithm(MazeAlgorithmType.RECURSIVE_BACKTRACKER_EDGES).build();
        MazeGenerator.generateMaze(map, params);

    }
}
