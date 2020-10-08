package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
         Map<String, String> languages = new HashMap<>();

         languages.put("Java", "a compiled high level OOP platform independent language");
         languages.put("SQL", "Structure Query Language");
         languages.put("JavaScript", "OOP code that allows for integration of complex tasks on the front end");
         languages.put("Ruby", "Ugh");
         languages.put("Ruby", "UUUUUUUUgggggggggghhhhhhhhh");

         if(languages.containsKey("Java")) {
             System.out.println("Language entry already on file");
         } else {
             languages.put("Java", "Course");
         }


        System.out.println(languages.get("Java"));




    }
}

