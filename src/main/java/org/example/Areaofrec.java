/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Areaofrec {
    public static void main(String[] args){
        int reallength;
        int realwidth;
        int area=0;
        double sq=0;
        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        System.out.println("What is the width of the room in feet?");
        Scanner scanner1 = new Scanner(System.in);
        String width = scanner.next();
        reallength = parseInt(length);
        realwidth = parseInt(width);
        System.out.println("You entered dimensions " + reallength + " feet by " + realwidth + " feet.");
        area = reallength * realwidth;
        sq = area * 0.09290304;
        DecimalFormat numberFormat = new DecimalFormat("#.000");

        System.out.println(area + " square feet" + "\n" + numberFormat.format(sq) + " square meters");
    }
}
