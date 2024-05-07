package com.example.app.helpers;

public class StringHelper {
    public static boolean regexEmailValidationPattern(String email) {
 String regex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
   if(email.matches(regex)){
       return true;
   }
   return false;
    }

}
