package combinators;

import java.time.LocalDate;

import static combinators.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicee@egmail.com",
                "4165866868",
                LocalDate.of(2001,1,1)
        );

        //System.out.println(new CustomerValidatorService().isVaid(customer));
        //if valid, we can store customer in db

        //using combinator pattern
       ValidationResult result = isEmailValid()
                .and( isPhoneNumberValid())
                .and( isAnAdult())
                .apply( customer );

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
