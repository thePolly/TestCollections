package com;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static public String line = "__________________";

    public static void main(String args[ ])
    {
        AllMethods allMethods = new AllMethods();
        ArrayList<SimpleEntity> list = allMethods.generateList();

        //show all names from entity list
        Stream<SimpleEntity> myStream = list.stream() ;
        myStream.forEach( e -> {
            System.out.println(e.getName());
        } );

        System.out.println(line);
        //filtering entities by age
       list.stream().filter( e -> e.getAge() > 18).forEach(System.out::println);

        System.out.println(line);
        //filtering entities by name length
        list.stream().filter(e -> e.getName().length() == 5).forEach(System.out::println );

        System.out.println(line);
        //map age to age+1
        list.stream().map(e -> e.getAge()+1).forEach(System.out::println );

        System.out.println(line);
        //limit stream entries
        list.stream().limit(2).forEach(System.out::println );

        System.out.println(line);

        //does any entry match isCool = true
        boolean ismatch = list.stream().anyMatch(SimpleEntity::getIsCoolEntity);
        System.out.println(ismatch);

        System.out.println(line);

        //does all entries match isCool = true
        boolean isallmatch = list.stream().allMatch(SimpleEntity::getIsCoolEntity);
        System.out.println(isallmatch);

        System.out.println(line);

        //does all entries not match name = "ice cream"
        boolean isnonematch = list.stream().noneMatch(e -> e.getName().equals("ice cream"));
        System.out.println(isnonematch);

        System.out.println(line);

        //sum of all ages
        int a = (int) list.stream().mapToInt(SimpleEntity::getAge).sum();
        System.out.println(a);

        System.out.println(line);

        //finds any entity
        Optional<SimpleEntity> anyElement =  list.stream().findAny();
        System.out.println(anyElement);

        //multiplication of all ages
        OptionalInt o = list.stream().mapToInt(SimpleEntity::getAge).reduce((e1, e2) -> e1*e2);
        System.out.println(o);

        System.out.println(line);

        //creating set of stream
        Set <SimpleEntity> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);

        System.out.println(line);

        //joining joins stream elements
        Stream s2 = Stream.builder().add("text1").add("text2").add("text3").build();
        String s = (String) s2.collect(Collectors.joining("is not equal to "));
        System.out.println(s); // super

        System.out.println(line);
        //Consumer
        //does not return anything so mostly is used to printing
        Consumer<String> upperCase = ss -> System.out.println(ss.toUpperCase());
        list.stream().forEach(x -> upperCase.accept(x.getName()));

        System.out.println(line);
        //Function
        //Accepts and returns something
        Function<List<SimpleEntity>, Integer> func = x -> x.get(1).getAge();
        list.stream().map(x -> func.apply(list)).forEach(System.out::println);

        System.out.println(line);
        //Supplier
        //Accepts nothing and returns something
        Random random = new Random();
        int rand = random.nextInt(list.size()-1);

        Supplier<SimpleEntity> ran = () -> list.get(rand);
        System.out.println(ran.get());
    }
}
