package com.company.util;

import java.util.Date;

public class CurrentDateUtil {

    public static long currentUnixTimastamp(){
        Date now = new Date();
        return now.getTime();
    }
}
