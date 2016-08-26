package com.javarush.test.level23.lesson04.home01;

import com.sun.javafx.tk.Toolkit;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* Inner 3
Внутри класса Solution:
1) реализуйте private class TaskDataProvider используя Task и DbMock, цель которого - обновить поле tasks.
2) реализуйте private class NameDataProvider используя String и DbMock, цель которого - обновить поле names.
*/
public class Solution {

    private List<Task> tasks;
    private List<String> names;





    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = ViewMock.getFakeTasksCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = ViewMock.getFakeNamesCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }



    class Task {
    }

    private class TaskDataProvider implements DbDataProvider{




        @Override
        public void refreshAllData(Map criteria)
        {
            List <Task> task = DbMock.getFakeTasks(criteria);
            if (task != null)
                tasks = DbMock.getFakeTasks(criteria);


        }
    }

    private class NameDataProvider implements DbDataProvider{




        @Override
        public void refreshAllData(Map criteria)
        {

            List <String> name = DbMock.getFakeNames(criteria);
            if (name != null)
                names = name;


        }
    }

//    public static void main(String[] args)
//    {
//            Solution sol = new Solution();
//        Class solclass = sol.getClass();
//        Field[] fields = solclass.getDeclaredFields();
//        for (Field f : fields) {
//            Class fieldType = f.getType();
//            System.out.println("Имя: " + f.getName());
//
//            System.out.println("Тип: " + fieldType.getName());
//        }
//            sol.refresh();
//        System.out.println(sol.names.hashCode());
//        System.out.println(sol.tasks.hashCode());
//
//    }


}
