/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egor.user;

import static com.egor.user.UserAccount.getInstance;

/**
 *
 * @author egor
 */
public class Source {
    public static void main(String []args)
    {
       UserAccount user1 = getInstance("Egor Kozitski","I do Not Know it","ekozitski@gmail.com");
       UserAccount user2 = getInstance();
       
       System.out.println("Checking authentication method for user1 with a right data: ");
       if (user1.authenticate("Egor Kozitski", "I do Not Know it"))
           System.out.println("Sucessfully");
       else
           System.out.println("Usecsfully");
       System.out.println();
       System.out.println("Checking authentication method for user1 with a wrong data: ");
       if (user1.authenticate("Egor Kozitski", "I d Not Know it"))
           System.out.println("Sucessfully");
       else
           System.out.println("Usecsfully");
       System.out.println("Displaying users accounts information");
       System.out.println();
       System.out.println("Displaying user1 account information: ");
       System.out.println(user1.getUserName());
       System.out.println(user1.getUserAccountId());
       System.out.println(user1.getEmail());
       System.out.println(user1.getPassword());
       System.out.println();
       System.out.println("Displaying user2 account information: ");
       System.out.println(user2.getUserAccountId());
       System.out.println(user2.getEmail());
       System.out.println(user2.getUserName());
       System.out.println(user2.getPassword());
       System.out.println();
       System.out.println("TESTING INSTANCE GETTER/SETTER METHODS(PROPERTIES)");
       System.out.println();
       System.out.println("Calling SETTER METHODS to SET DATA(Properties)");
       user2.setUsername("Scruffy_the_guy");
       user2.setPassword("doctor Zoildberg");
       user2.setEmail("bender@benderlog.bd");
       System.out.println();
       System.out.println("Displaying User Account information (user2)");
       System.out.println(user2.getEmail());
       System.out.println(user2.getPassword());
       System.out.println(user2.getUserAccountId());
       
       
    }
}
