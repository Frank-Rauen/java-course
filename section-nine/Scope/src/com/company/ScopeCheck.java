package com.company;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println( i + " X 2 = " + (i * varTwo));
        }
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("Innerclass varThree = " + varThree + " varOne = " + varOne);
        }

        public void timesTwo() {
            System.out.println("varOne available here " + varOne);
            for(int i = 0; i < 10; i++) {
                System.out.println( i + " X 3 = " + (i * varThree));
            }
        }
    }
}
