/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuantu.mathutil.main;

import com.tuantu.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
    
    //thử nghiệm
    long expected = 120;//ki vong
    int n = 5;
    long actual = MathUtil.getFactorial(n);
    System.out.println("5! ="+expected+" expected");
    System.out.println("5! = " +actual+" actual" );
    
    
}
}
