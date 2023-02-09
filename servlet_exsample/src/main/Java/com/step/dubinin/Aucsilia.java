package com.step.dubinin;

public class Aucsilia {

    public static String getUserScrol(String[] arr) {
        StringBuffer sb = new StringBuffer("<ol>" );
        for (String i : arr) {
            sb.append("<li>" + i + "</li>" );
        }
        return sb.append("</ol>" ).toString();
    }


}
