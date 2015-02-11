/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egor.user;

import static com.egor.user.User.getInstance;

/**
 *
 * @author egor
 */
public class Source {
    public static void main(String []args)
    {
       User usr = getInstance();
       System.out.print(usr.getUserName()+" "+usr.getUserAccountId());
    }
}
