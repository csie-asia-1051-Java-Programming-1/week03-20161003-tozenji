package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021118鄭曉玫
 */
import java.util.Scanner;
public class ex03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char i = scn.next( ).charAt(0);
		if(65<=(int)i && (int)i<=90){
			int x = (int)i+32;
			System.out.println("轉小寫=" + (char)x);
			
		}else{
			if(67<=(int)i && (int)i<=122){
				int y = (int)i-32;
				System.out.println("轉大寫=" + (char)y);
		}
		
	}

	}
	}
