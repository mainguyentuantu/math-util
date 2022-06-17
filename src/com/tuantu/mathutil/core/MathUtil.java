/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuantu.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class cung cấp nhiều hàm xử lý toán học
    public static long getFactorial(int n){
        if ( n< 0 || n> 20)
            throw new IllegalArgumentException("Invaid argument. N must be between 0..20");
        if ( n == 0 || n== 1)
            return 1;//kết thúc đầu vào đặc biệt
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product*= i;
           return product;
           
       
            
        }
    }
