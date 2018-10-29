package com.week1.decimal;

import org.junit.Assert;
import org.junit.Test;
/**
 * 1、写一个程序，输入是一个十进制整数，输出是它的二进制表示的字符串。函数原型是
 * String oct2Bin(int a)
 * 例如，输入8，返回值是“1000”。要考虑负数哦。
 * @author Administrator
 *
 */
public class test {

	@Test
	public void test1(){
		int i = 1;
		//Assert.assertTrue((i << 30)> 0);
//		Assert.assertTrue((i << 31)< 0);
		Assert.assertEquals((i << 31), Integer.MIN_VALUE);
	}
	
	
	/**
	 * 输入8，返回值是“1000”。要考虑负数哦
	 * @param a
	 * @return
	 */
	
	public static String oct2Bin(int a){
		String str = new String();
		
		//循环 模 2 取出 最低位
		while(a % 2 >= 0 ){
			
			if(a == 0 || a == 1){
				break;
			}
			
			if(a % 2 != 0){
				str =  a % 2 + str;
			}else{
				str = "0" + str;
			}
			a = a / 2 ;
		}
		
		// 判断 a 的符号 , 如果 a < 0 拼接符号位  
		if(a >= 0){
			str = a + str;
		}else{
			
			str = Math.abs(a) + str;
			//32位
			String intStr = new String("1");
			for (int i = 0; i < 31; i++) {
				intStr = intStr + "0";
			}
			System.out.println(intStr);
			intStr = intStr.substring(0, intStr.length()-str.length());
			System.out.println(intStr);
			str = intStr + str ; 
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(oct2Bin(0));
	}
}
