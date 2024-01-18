package com.myblog.myblog11;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; // Import the Collectors class
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> numbers = Arrays.asList("mike","adam","mike","stallin");
//        List<String> data1 = numbers.stream().filter(s ->s.startsWith("m")).collect(Collectors.toList());
//        List<String> data2 = numbers.stream().filter(s ->s.equals("mike")).collect(Collectors.toList());
//        List<String> data3 = numbers.stream().filter(s ->s.endsWith("n")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);
//        List<Integer> numbers = Arrays.asList(2, 4, 50, 27, 28);
//        List<Integer> data = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(data);

//        List<Integer> data = Arrays.asList(2, 4, 7, 15, 18, 19, 20);
//        List<Integer> kaushal = data.stream().filter(i -> i > 10).collect(Collectors.toList());
//        System.out.println(kaushal);
//
//        List<Integer> Data = Arrays.asList(4, 15, 30, 15, 30, 20);
//        List<Integer> numbers = Data.stream().distinct().collect(Collectors.toList());
//        System.out.println(numbers);

//        List<String> Numbers = Arrays.asList("kaushal", "manu", "sonu", "gautam");
//        List<String> collect = Numbers.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
//        System.out.println(collect);
//

//        List<Integer> Person = Arrays.asList(10, 15, 30, 40, 50);
//        List<Integer> collect = Person.stream().map(e -> e + 10).collect(Collectors.toList());
//        System.out.println(collect);= Arrays.asList(10, 15, 30, 60.70);

//        List<Integer> Person = Arrays.asList(10, 15, 30, 40, 50);
//        List<Integer> collect = Person.stream().map(n -> n * n).collect(Collectors.toList());
//        System.out.println(collect);
//        List<Integer> Person = Arrays.asList(10, 15, 30, 40, 50);
//        List<Integer> collect = Person.stream().map(n -> n + n).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String> Words = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Apricot", "Grapes");
//        long value = Words.stream().filter(Word -> Word.startsWith("A") && Word.length() > 3).distinct().count();
//
//          System.out.println(value);
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Apricot", "Grapes");


        long count = words.stream()
                .filter(word -> word.startsWith("A") && word.length() > 3)
                .distinct()
                .count();


        System.out.println("Count of distinct words starting with 'A' and length > 3: " + count);
    }
}
