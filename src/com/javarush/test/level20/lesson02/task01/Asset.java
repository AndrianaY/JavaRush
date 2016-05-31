package com.javarush.test.level20.lesson02.task01;

import java.io.*;

public class Asset implements Serializable {
    public Asset(String name) {
        this.name = name;
    }
    public Asset(){

    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void save(OutputStream outputStream) throws Exception
    {
        PrintWriter printWriter = new PrintWriter(outputStream, true);
        printWriter.println(name);
        printWriter.println(price);
        printWriter.flush();
    }

    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String str = reader.readLine();
            this.name = str;
            price = Double.parseDouble(reader.readLine());


    }
}
