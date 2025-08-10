package io.javabrains.functionaljava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JDKFunctionalInterfacesDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> myFunc = x -> x * 2;
        System.out.println(myFunc.apply(10));

        Function<Integer, String> f2 =  num -> "Value is " + num;
        System.out.println(f2.apply(10));

        Consumer<String> greeting = name -> System.out.println("Hello, " + name);
        greeting.accept("Vella");

        Supplier<Double> random =  () -> Math.random();
        System.out.println(random.get());

        Predicate<Integer> isEven = num -> (num % 2) == 0;
        System.out.println(isEven.test(10));
        //isEven.test(5);


    }
}
