package com.javarush.level24.lesson02.home01;

import java.lang.reflect.Method;

public class Util {

    //пример того, как можно использовать интерфейс-маркер
    //this method is available only for a SelfInterfaceMarker implementation
    public static void testClass(SelfInterfaceMarker interfaceMarker) throws UnsupportedInterfaceMarkerException
    {
        for (Method method : interfaceMarker.getClass().getDeclaredMethods()) {
            if(interfaceMarker == null)
                throw new UnsupportedInterfaceMarkerException();
            System.out.println(method);
        }
    }

}