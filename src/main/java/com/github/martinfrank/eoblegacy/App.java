package com.github.martinfrank.eoblegacy;

import com.github.martinfrank.eoblegacy.map.DemoMap;
import com.github.martinfrank.eoblegacy.map.DemoMapFactory;
import com.github.martinfrank.eoblegacy.map.DemoMapPartFactory;
import com.github.martinfrank.eoblegacy.map.DemoMapWalker;
import com.github.martinfrank.maplib.MapStyle;

public class App
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    private void start() {

        DemoMapPartFactory mapPartFactory = new DemoMapPartFactory();
        DemoMapFactory mapFactory = new DemoMapFactory(mapPartFactory);
//        demoMap = mapFactory.createMap(12, 6, MapStyle.HEX_HORIZONTAL);
        DemoMap demoMap = mapFactory.createMap(64, 64, MapStyle.SQUARE4);
        demoMap.scale(3f);
        DemoMapWalker walker = mapPartFactory.createWalker();

    }
}
