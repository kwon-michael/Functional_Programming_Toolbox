package Functional_Interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println("using a method: ");
        System.out.println(increment);

        //how to use Function
        //Functions take 1 argument and produces 1 result
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("using a function: ");
        System.out.println(increment2);


        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("Without chaining two functions: ");
        System.out.println(multiply);

        //Using andThen to chain 2 functions
        Function<Integer, Integer> AddByOneThenMultiplyByTen =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("Chaining two functions: ");
        System.out.println(AddByOneThenMultiplyByTen.apply(1));

        //BiFunction takes 2 integers and produces an int values result
        //BiFunction example
        System.out.println("BiFunction example: ");
        System.out.println(incrementByOneAndMultiplyFunction.apply(4,100));


    }
    //Function example (Increment by 1)
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    //multiplies by 2 using a Function
    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    //increments first Integer by 1 and then multiplies by second Integer
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyFunction = (numberToIncrementByOne, numbertoMultiply) -> (numberToIncrementByOne+1) * numbertoMultiply;
    //increment by 1 using a method
    static int incrementByOne(int number){
        return number + 1;
    }
}
