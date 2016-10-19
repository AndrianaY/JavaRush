package com.javarush.level16.lesson13.bonus01;

import com.javarush.level16.lesson13.bonus01.common.*;

/**
 * Created by Andriana_Yarmoliuk on 4/22/2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes it){
        if (it == ImageTypes.JPG) {
            return new JpgReader();
        } else if (it == ImageTypes.PNG) {
            return new PngReader();
        } else if (it == ImageTypes.BMP){
            return new BmpReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
