package FinalSection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Callbacks {
    public static void main(String[] args) {
        hello( "john", null, firstName -> {
            System.out.println("no lastname provided for " + firstName);
        } );
        hello2( "john", null, () -> {
            System.out.println("no lastname provided");
        } );

    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept( firstName );
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    //Javascript equivalent

//    function hello(firstName, lastName, callBack){
//        console.log(firstName):
//        if (lastName){
//            console.log(lastName)
//        } else {
//            callback();
//        }
//    }
}
