package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Frank");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);

        Double doubleValue = new Double(54.54);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println("-> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;

        System.out.println(myIntValue);

        int myInt = myIntValue.intValue();

        System.out.println(myIntValue);
        System.out.println(myInt);

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double db = 0; db <= 10; db+= .5) {
            myDoubleValues.add(Double.valueOf(db));
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }




    }
}
