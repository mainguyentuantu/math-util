/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuantu.mathutil.test.core;

import com.tuantu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //dây là là class se su dung ham cua thu vien/ framework Jnit
    //kiem thu /kiem tra code chinh - ham tinh gia thua
    //class core.MathUtil
    //viet vode de test code chinh
    
    //co nhieu quy tac dat ten ham test
    //nhung thuong noi len tinh huong/ muc dich kiem thu
    //tinh huong xai ham theo kieu thanh cong hay that bai!!
    
    //@Test Junit phoi hop voi JPM de chay ngam nay
    //@Test phia hau truong chinh la public static  void main() 
    //cos nhieu @Test ung voi nhieu case khac nhau de kiem thu tinh giai thua 
    
   @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        //tinh huong xai ham thanh cong, theo kieu well
        
        int n = 0;//test tinh huong tu te, phai dung
        
        long expected = 1 ;//hy vong 0! = 1
        
       // long actual = goij hamf cam test
       
       long actual = MathUtil.getFactorial(n);
       
       //so sanh ecpected & actual dung xanh do framework
       
       Assert.assertEquals(expected, actual);
       
       //ham giup so sanh 2 gia tri co bang nhua hay khong 
       //neu giong nhau => xanh
       //khac nhau => do
       
       Assert.assertEquals(1, MathUtil.getFactorial(1));
       Assert.assertEquals(2, MathUtil.getFactorial(2));
       Assert.assertEquals(6, MathUtil.getFactorial(3));
       Assert.assertEquals(24, MathUtil.getFactorial(4));
       Assert.assertEquals(120, MathUtil.getFactorial(5));
       Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
       
       //dua gia tri sai
       //ta ki vong xuat hien ngoai le khi n < 0 hoac n > 20 => ham dung voi ki vong
       // n < 0 hoac n > 20 ham khong cho ra ngoai le => sai ki vong
       //la nhung thu khong the do luong  so sanh nhu kieu value
        //ma chi co the do luong = cach xem chung co xuat hien hay khong
        //assertEquals() khong dung de so sanh ngoai le
        //      equals() la bang nhau hay khong tren value!!!
//        
//       @Test( expected = NumberFormatException.class)
//       public  void testGetFactorialGivenAgumentThrowsException(){
//           MathUtil.getFactorial(-5) ;//hamf chay se ra ngoai le NumberFormat..

//           //ham cho ra do, co cho ra ngoai le,    nhung ko phai ngoai le nhu ki vong
//           //khong phai ham nem sai
           
@Test( expected = IllegalArgumentException.class)
         public  void testGetFactorialGivenAgumentThrowsException(){
             MathUtil.getFactorial(-5) ;

    }
       
       
    }

