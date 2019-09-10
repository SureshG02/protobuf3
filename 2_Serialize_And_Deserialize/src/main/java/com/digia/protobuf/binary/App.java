package com.digia.protobuf.binary;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String email = "j@baeldung.com";
        int id = new Random().nextInt();
        String name = "Michael Program";
        String number = "01234567890";
        AddressBookProtos.Person person =
                AddressBookProtos.Person.newBuilder()
                        .setId(id)
                        .setName(name)
                        .setEmail(email)
                        .addNumbers(number)
                        .build();

        
    }
}
