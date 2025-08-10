package io.javabrains.functionaljava;

import java.util.function.Function;

public class ScopesProblem {

    public static Function<Integer, Integer> counter() {

        int count =0;
        Function<Integer, Integer> increment = x -> count+1; // This will not work as count is effectively final
        return increment;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> increment = ScopesProblem.counter();
        System.out.println(increment.apply(10)); // This will always print 1, as count is not updated
    }
}
