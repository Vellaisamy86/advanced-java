package io.javabrains.functionaljava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) throws IOException {
        // Example of using streams in Java
        // This is a placeholder for actual stream operations
        System.out.println("StreamsDemo is running");

        // You can add stream operations here, such as filtering, mapping, etc.
        // For example:
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(System.out::println);
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                        .filter(num -> num % 2 == 0) // Filter even numbers
                        .sum(); // Sum them up
        System.out.println("Sum of even numbers: " + sum);

        Stream.of("Java", "Python", "C++", "JavaScript")
                .filter(lang -> lang.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Files.lines(Paths.get("README.md"))
                .forEach(System.out::println);
        Stream.generate(new Random()::nextDouble)
                .limit(5)
                .forEach(System.out::println);
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

    }
}
