package Functional_Interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Normal Java
        System.out.println("Without Predicate: ");
        System.out.println(isPhoneNumberValid("4160000000"));
        System.out.println(isPhoneNumberValid("6470000000"));

        //using Predicate functional interface
        System.out.println("using Predicate functional interface: ");
        System.out.println(isPhoneNumberValidPredicate.test("4160000000"));
        System.out.println(isPhoneNumberValidPredicate.test("6470000000"));

        //Chaining Predicates using .and / .or
        System.out.println("Is phone number valid and contains number 3 = "+
        isPhoneNumberValidPredicate.and(containsNumber3).test("4160000003"));

        //These two print functions have the same phone number
        System.out.println("Is phone number valid and contains number 3 = "+
                isPhoneNumberValidPredicate.or(containsNumber3).test("4160000000"));
        System.out.println("Is phone number valid and contains number 3 = "+
                isPhoneNumberValidPredicate.and(containsNumber3).test("4160000000"));


    }

    //Normal Java to check phone number validity
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("416") && phoneNumber.length() == 10;
    }
    //Predicate Functional Interface to check if phone number starts with "416" and is length of 10.
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("416") && phoneNumber.length() == 10;
    //Predicate to determine if phone number contains "3"
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    //create BiPredicate
}
