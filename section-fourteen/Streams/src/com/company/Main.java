package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "I5",
                "B12", "B18",
                "G18","g6",
                "O6");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(num -> {
//            if(num.toUpperCase().startsWith("G")) {
//                gNumbers.add(num);
////                System.out.println(num);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) ->System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I29", "I18", "O9");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("*************************");
        System.out.println(concatStream.distinct()
                .peek(System.out::println).count());
    }
}
