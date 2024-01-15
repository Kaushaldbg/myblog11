package com.myblog.myblog11;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; // Import the Collectors class

public class Main {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("mike","adam","mike","stallin");
        List<String> data1 = numbers.stream().filter(s ->s.startsWith("m")).collect(Collectors.toList());
        List<String> data2 = numbers.stream().filter(s ->s.equals("mike")).collect(Collectors.toList());
        List<String> data3 = numbers.stream().filter(s ->s.endsWith("n")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}
