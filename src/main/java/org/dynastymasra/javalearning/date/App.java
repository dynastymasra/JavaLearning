package org.dynastymasra.javalearning.date;

import java.util.ArrayList;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class App {

    private static ArrayList<String> date = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateConvertion dateConvertion = new DateConvertion();
        dateConvertion.dateConvertion("13-09-1991");
    }
}

