package Functional_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John",Gender.MALE),
        new Person("Maria",Gender.FEMALE),
        new Person("Josh",Gender.MALE),
        new Person("Alice",Gender.FEMALE),
        new Person("Tyler",Gender.MALE)
        );

        // imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);

            }
        }
        System.out.println("Imperative approach");
        for (Person person :females){
            System.out.println(person);
        }
        // Declarative approach
        System.out.println("Declarative approach");
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
                females2.forEach(System.out::println);
    }
}
