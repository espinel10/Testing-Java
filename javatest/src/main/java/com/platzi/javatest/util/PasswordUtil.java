package com.platzi.javatest.util;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK,MEDIUM , STRONG;
    }
    public static SecurityLevel assessPassword(String passwords){
        if(passwords.length() < 8){
            return SecurityLevel.WEAK;
        }
        if (passwords.matches("[a-zA-z]+")){
            return SecurityLevel.WEAK;
        }
        if(passwords.matches("[a-zA-Z0-9]+")){
            return  SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
