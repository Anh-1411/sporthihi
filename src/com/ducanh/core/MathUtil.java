/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ducanh.core;

/**
 *
 * @author Admin
 */
//Class này cung cấp các tiện ích/ đồ chơi/ 1loatj các hàm toán học
//Giup cho các class khác sử dụng
public class MathUtil {
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. " + "n must be between 0..20");
        if( n == 0 || n == 1)
            return 1;
        long product = 1; //Kết quả hiện ra
        for (int i = 2; i <= n; i++) 
            product *= i;
            
            return product;
        
    }
}
