package io.javabrains.functionaljava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesDemo {

    public static void main(String[] args) {

        Supplier<Double> random = Math::random;
        System.out.println("Random number: " + random.get());

        Function<Person, String> getName = Person::getName;
        System.out.println("Person's name: " + getName.apply(new Person("John", 30)));

        Person p1 = new Person("Foo", 25);
        Person p2 = new Person("Bar", 45);

        BiPredicate<Person, Person> isEqual = Person::equals;
        System.out.println("Are persons equal? " + isEqual.test(p1, p2));

        Function<ArrayList<String>, Integer> getCount = List::size;
        System.out.println("Count of items in list: " + getCount.apply(new ArrayList<>(List.of("A", "B", "C"))));

        Function<List<String>, Collection<String>> dedupe = HashSet::new;


    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}