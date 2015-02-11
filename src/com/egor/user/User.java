/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egor.user;

/**
 *
 * @author egor
 */
import java.util.UUID;
public class User {
    private UUID userAccountId;
    private String username;
    private String password;
    private String email;
    User()
    {
        this.userAccountId=UUID.randomUUID();
        this.username=" ";
        this.password=" ";
        this.email=" ";
    }
    User(String usr,String pass,String em)
    {
        this.userAccountId=UUID.randomUUID();
        setUsername(usr);
        setPassword(pass);
        setEmail(em);
    }
    public String getUserAccountId()
    {
        return userAccountId.toString();
    }
    public String getUserName ()
    {
        return username;
        
    }
    public String getPassword()
    {
        return password;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void setUsername(String usr)
    {
        this.username=usr;
    }
    public void setPassword(String m_Password)
    {
        this.password=m_Password;
    }
    public void setEmail(String m_Email)
    {
        this.email=m_Email;
    }
    public static User getInstance()
    {
       
       User usr =  new User();
       return usr;
    }
    public static User getInstance(String U,String P,String E)
    {
        User usr = new User(U,P,E);
        return usr;
    }
    public boolean authenticate(String U,String P)
    {
        return ((U.equals(getUserName()))&&(P.equals(getPassword()))) ? true : false;
    }
}
