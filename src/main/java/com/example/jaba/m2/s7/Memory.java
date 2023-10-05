/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s7;

import java.util.Arrays;

/**
 * Stack vs Heap
 */
public class Memory {
    /**
     * A primitive could be on the stack or on the heap (inside an object). An
     * object could only be on the heap. A reference to an object could be on the
     * stack or on the heap (inside an object).
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // primitive, on the stack
        int x = 12;
        System.out.println(x);
        
        //modify Edo
        Animals[] animals = Animals.values();
        System.out.println(Arrays.toString(animals));
        
        // reference, the object is on the heap, it contains primitive values
        int values[] = { 7, x };
        System.out.println(Arrays.toString(values));

        String s = "Tom";
        System.out.println(s);

        int data[] = new int[3];
        System.out.println(Arrays.toString(data));

        // reference, the object is on the heap, it contains references to other objects
        String[] names = { "Bo", s };
        System.out.println(Arrays.toString(names));
    }
}
