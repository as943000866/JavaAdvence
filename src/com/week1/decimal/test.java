package com.week1.decimal;

import org.junit.Assert;
import org.junit.Test;
/**
 * 1��дһ������������һ��ʮ������������������Ķ����Ʊ�ʾ���ַ���������ԭ����
 * String oct2Bin(int a)
 * ���磬����8������ֵ�ǡ�1000����Ҫ���Ǹ���Ŷ��
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
	 * ����8������ֵ�ǡ�1000����Ҫ���Ǹ���Ŷ
	 * @param a
	 * @return
	 */
	
	public static String oct2Bin(int a){
		String str = new String();
		
		//ѭ�� ģ 2 ȡ�� ���λ
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
		
		// �ж� a �ķ��� , ��� a < 0 ƴ�ӷ���λ  
		if(a >= 0){
			str = a + str;
		}else{
			
			str = Math.abs(a) + str;
			//32λ
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
