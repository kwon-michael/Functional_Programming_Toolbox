package Functional_Interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "416 555 8374");
        //Using normal Java
        System.out.println("Using normal Java: ");
        greetCustomer(maria);


        //Using Consumer Functional Interface
        //Consumers are functions which take one parameter but return no result
        //Consumers are similar to void in normal Java
        System.out.println("\nWith Consumer functional interface: ");
        greetCustomerConsumer.accept(maria);

        //using BiConsumer Functional Interface
        //Biconsumer accepts 2 arguments
        //This BiConsumer accepts String and Boolean and will hide the phonenumber if false.
        greetCustomerConsumerV2.accept(maria,false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName + " thank you for registering " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName + " thank you for registering " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName + " thank you for registering " + customer.customerPhoneNumber);
    }
}
