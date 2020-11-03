package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee frank = new Employee("Frank Rauen", 27);
        Employee anne = new Employee("Anne Rice", 60);
        Employee dave = new Employee("Dave Smith", 18);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(frank);
        employees.add(anne);
        employees.add(dave);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//       for(Employee employee : employees) {
//           System.out.println(employee.getName());
//           System.out.println(employee.getAge());
//       }

//        System.out.println("*****************************");
//
//       Employee employee;
//
//       for(int i = 0; i < employees.size(); i++) {
//           employee = employees.get(i);
//           System.out.println(employee.getName());
//           new Thread(() -> System.out.println(employee.getAge())).start();
//       }
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {
         int i = 0;

         UpperConcat uc = (s1, s2) -> {
             System.out.println("Lambda expression's class is " + getClass().getSimpleName());
             System.out.println("i in the Lambda expression = " + i);
             String result = s1.toUpperCase() + s2.toUpperCase();
             return result;
         };

            System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
            return Main.doStringStuff(uc,"String1", "String2");
    }

    public void printValue() {
        int num = 25;
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Value is " + num);
        };

        new Thread(r).start();
    }
}

