package com.company;

public class Main {

    public static void main(String[] args) {
        String varFour = "Private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("privateVar = " + scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        System.out.println(varFour);
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();



    }
}
