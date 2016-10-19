package com.javarush.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("d:\\your_file_name", true);
            InputStream inputStream = new FileInputStream("d:\\your_file_name");

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);

            System.out.println(somePerson.name);
            System.out.println(ivanov.equals(somePerson));
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            printWriter.println("human name");
            printWriter.println(this.name);
            if(assets != null)
            {
                printWriter.println("asset");
                for (Asset a : assets)
                {
                    a.save(outputStream);
                }

                //implement this method - реализуйте этот метод
            }
            else
                printWriter.println("no assets");
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isName = reader.readLine();
            while(reader.ready())
            {
                if (isName.equals("human name"))
                {
                    this.name = reader.readLine();
                }
                String areAssets = reader.readLine();
                if (areAssets.equals("asset"))
                {
                    do
                    {
                        Asset asset = new Asset();
                        asset.load(inputStream);
                        assets.add(asset);
                        areAssets = reader.readLine();
                    }
                    while (!(areAssets.equals("human name")));
                    isName = areAssets;
                }
            }
            //implement this method - реализуйте этот метод
        }
        public boolean equals(Human human){
            boolean equals = false;
            if(this.name.equals(human.name)){
                if (this.assets.size()==human.assets.size()){
                    int i = 0;

                    for (Asset a : this.assets)
                    {
                        if(a.getName().equals(human.assets.get(i).getName())){
                            equals = true;
                        }
                        else
                        {
                            equals = false;
                            break;
                        }
                        i++;
                    }
                }
            }
            return equals;
        }


    }
}
