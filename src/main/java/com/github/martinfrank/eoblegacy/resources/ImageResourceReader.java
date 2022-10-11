package com.github.martinfrank.eoblegacy.resources;

import java.io.InputStream;

public class ImageResourceReader {

    public InputStream readImage(ImageId imageId)  {
        return getClass().getClassLoader().getResourceAsStream(imageId.filename);
    }

}
