package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Test3 {
    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10,20,30,60,90);
//        List<Integer> newNumbers = data.stream().map(i -> i +10).collect(Collectors.toList());
//        System.out.println(newNumbers);


//        List<String> data = Arrays.asList("mike", "stallin", "adan");
//        List<String> newData = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);


//        List<Integer> data = Arrays.asList(15, 6, 100,15,30,40);
//        List<Integer> newData =   data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

//        Consumer<Integer> result = number-> System.out.println(number);
//        result.accept(100);

//        List<String> names = Arrays.asList("mike", "adam", "sam");
//      Consumer<String> val = name-> System.out.println(name);
//       names.forEach(val);

        //System.out.println(new Random().nextInt(500));
//        Supplier<Integer> x = ()-> new Random().nextInt(500);
//        Integer y = x.get();
//        System.out.println(y);

        List<Employee> employees = Arrays.asList(
               new Employee("mike", 30, "chennai"),
                new Employee("adam", 25, "chennai"),
               new Employee("stallin", 30, "pune"),
                new Employee("tanu", 34, "bengal")
       );
       // Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
//        for(Employee employee:employees) {
//            List<Employee> e = collect.get(employee.getAge());
//            for(Employee x:e){
//                System.out.println(x.getName());
//                System.out.println(x.getCity());
//                System.out.println(x.getAge());

        for(Map.Entry<Integer,List<Employee>>entry : collect.entrySet()){
            int age = entry.getKey();
            List<Employee>employeesWithAge = entry.getValue();
            System.out.println("age:"+age+"--"                                     );

            for(Employee e:employeesWithAge){
                System.out.println(e.getCity());
                System.out.println(e.getName());

            }
        }

//
//        List<Employee>emps= employees.stream().filter(emp -> emp.getAge() >30).collect(Collectors.toList());
//       // employees.stream().filter(emp ->emp.startWith("t")).collect(Collectors.toList());
//        List<Employee> emps2 = employees.stream()
//                .filter(emp -> emp.getName().startsWith("t"))
//                .collect(Collectors.toList());
//               for(Employee e:emps2 ){
//                   System.out.println(e.getName());
//
//               }
//
//        for(Employee e: emps){
//           System.out.println(e.getName());
//           System.out.println(e.getAge());
//           System.out.println(e.getCity());
//       }


       // List<Integer> numbers = Arrays.asList(10, 12, 6, 5, 7, 8, 9);
      //  List<Integer> data = numbers.stream().filter(n -> n % 2 == 0).map(n1 -> n1 * n1).collect(Collectors.toList());
        //  System.out.println(data);
    }
}
