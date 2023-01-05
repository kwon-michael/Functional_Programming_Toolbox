package Functional_Interfaces;

/*
To be used with Functional_Interfaces._Function class
 */
public class Person {
     final String name;
     final Gender gender;

     Person(String name, Gender gender){
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
enum Gender{
    MALE, FEMALE
}
