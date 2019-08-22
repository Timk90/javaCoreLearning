package com.learning.lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaMain {

    public static void main(String[] args) {

        MyFuncInterface mfi = (String x) -> {System.out.println(x);};

        mfi.simpleMethod("Hello!");

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        //here Lambda expression implements Consumer functional interface
        arr.forEach(n -> System.out.println(n));

        //here Lambda expression implements Consumer functional interface for
        //list (shorter version)
        arr.forEach(System.out::println);

        arr.addAll(Arrays.asList(5,6,7,8,9, 10));

        System.out.println("============");
        printAll(arr, n->n>0);
        System.out.println("============");
        printAll(arr, n->n>3);
        System.out.println("============");
        printAll(arr, n->n%2 == 0);
        System.out.println("============");

        Consumer<String> consumer;


    }

    static int printAll(List<Integer> numbers, Predicate<Integer> predicate){
        int total = 0;
        for(int number : numbers){
            if(predicate.test(number)){
                System.out.println(total += number);
            }
        }
        return total;
    }

}
