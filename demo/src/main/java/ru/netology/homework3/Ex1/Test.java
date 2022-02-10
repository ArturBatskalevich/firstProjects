package ru.netology.homework3.Ex1;

import java.util.HashMap;

public class Test {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    private static class Tain {
        public static void main(String[] args) {
            HashMap<Test, String> map = new HashMap<>();
            Test a1 = new Test();
            Test a2 = new Test();
            map.put(a1, "A1");
            map.put(a2, "A2");
            System.out.println(map.get(a1)+map.get(a2));
        }


    }
}
