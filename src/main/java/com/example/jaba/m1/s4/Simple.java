/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s4;

/**
 * A "hello" program that uses the arguments passed by the user
 * 
 * @author Emanuele Galli
 */
public class Simple {
    /**
     * Print hello for the passed unique argument (or generic hello)
     * 
     * @param args the user passed arguments, expected just 0 or 1 of them
     */
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello, ");

        // if the caller passes exactly one parameter, output it
        if (args.length == 1) {
            System.out.println(args[0]);
        } else if (args.length == 2) {
        	System.out.println(args[0] + " , " + args[1]);
        } else {
            // otherwise output something generic
            System.out.println("stranger");
        }
    }
}
