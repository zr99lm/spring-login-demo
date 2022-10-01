package com.zr.util;

public class StringUtil {
    public static boolean isEmpty(String name){
        if(name==null||"".equals(name.trim())){
            return true;
        }
        else {
            return false;
        }
    }
}
