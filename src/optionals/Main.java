package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable(null)
                .ifPresentOrElse(email-> System.out.println("sending email to " + email),() -> System.out.println("cannont sent email"));


                //.orElseThrow(()-> new IllegalStateException("exception"));
                //.orElseGet(()->"default value");

        //System.out.println(value);
    }
}
