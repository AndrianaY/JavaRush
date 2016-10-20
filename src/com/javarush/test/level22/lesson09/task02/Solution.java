package com.javarush.test.level22.lesson09.task02;

import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        String key, val;
        boolean isFirst = true;
        for (Map.Entry<String, String > m : params.entrySet())
        {
            key = m.getKey();
            val = m.getValue();
            if((val != null) && isFirst){
                sb.append(key + " = '" + val + "'");
                isFirst = false;
            }
            else if((val != null) && (!isFirst)){

                sb.append(" and " + key + " = '" + val + "'");
            }
        }
        return sb;
    }
}
