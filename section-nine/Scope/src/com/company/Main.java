package com.company;

public class Main {

    public static void main(String[] args) {
        String privateVar = "Private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("privateVar = " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        scopeInstance.timesTwo();
        System.out.println(privateVar);
        innerClass.timesTwo();


    }
}
