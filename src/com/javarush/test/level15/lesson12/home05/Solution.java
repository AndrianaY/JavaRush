package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(int i){

    }
    public Solution(String s){

    }
    public Solution(double d){

    }

    protected Solution(int i, String s){

    }
    protected Solution(String s, int i){

    }
    protected Solution(double d, int i){

    }

    private Solution(int i, double d, String s){

    }

    private Solution(int i, double d, String s, int k){

    }

    private Solution(double d, String s){

    }

    Solution(Object a){

    }
    Solution(int i,String s, double d){

    }
    Solution(String s, double d, Integer k){

    }
}


