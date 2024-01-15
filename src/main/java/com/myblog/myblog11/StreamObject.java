package com.myblog.myblog11;

import com.fasterxml.jackson.annotation.JacksonInject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args){
        // stream API - collection process
        // collection / group of object
        Stream<Object> emptyStream = Stream.empty();
       String names[] = {"Durgesh","uttam","Ankit","Divya"};
        Stream<Object> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);


    });
        Stream<Object> streamBuilder = Stream.builder().build();

  IntStream stream   =  Arrays.stream(new int[]{2,4,65,3,564});
  stream.forEach(e -> {
      System.out.println(e);
  });
    List<Integer> list2 = new ArrayList<>();
    list2.add(12);
    list2.add(34);
    list2.add(23);
    list2.add(78);
        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });


    }
}
