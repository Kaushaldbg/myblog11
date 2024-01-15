package com.myblog.myblog11;

import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamMain1 {
    public static void main(String[] args){
        //Q)Create a List and Filter all even numbers from list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
       // System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer>list3 = asList(23,567,12,677,24);

        List<Integer> listEven=new ArrayList<>();
        for(Integer i : list1)
        {
            if(i%2==0)
            {
                listEven.add(i);

            }
        }
        System.out.println(list1);
        System.out.println(listEven);


        //using Stream
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> newlist1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newlist1);


    }
}
