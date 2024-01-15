package com.myblog.myblog11;

import java.util.List;
import java.util.stream.Collectors;

public class Methsod {
    public static void main(String[] args) {


        //filter(predicate)
        //boolean value function

        //e->{return}


        //map
        List<String> names = List.of("Aman", "Ankit", "abhinav", "durgesh");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers= List.of(23,4,2,5,7,4);
        List<Integer> kaushal = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(kaushal);
        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );
        newNames.stream().forEach(System.out::println);

        //sort
        numbers.stream().sorted().forEach(System.out::println);
        Integer integer = numbers.stream()
                .min((x, y) -> x.compareTo(y)).get();
         System.out.println(integer);
    }
}
