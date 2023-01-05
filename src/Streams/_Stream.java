package Streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Josh", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Tyler", Gender.MALE),
                new Person("Bobby", Gender.PREFER_NOT_TO_SAY)

        );
//        Function<Functional_Interfaces.Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;

        //The above is the same as below
        //Using .stream

//        people.stream()
//                .map(person -> person.name)
////                .collect(Collectors.toList()) //This puts person.name into list
//                .mapToInt(String::length)  //This measures the length of each person.name
//                .forEach(System.out::println);

        boolean containsOnlyFemale =  people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemale);
    }

    static class Person {
        final String name;
        final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Functional_Interfaces.Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
