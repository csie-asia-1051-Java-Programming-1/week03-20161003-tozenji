package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021118 周永振老師
 */
import java.util.Scanner;
public class ex05_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		if(v1%2==0){
			System.out.println("偶");
		}else{
			if(v1%2!=0){
				System.out.println("奇");	
			}
		}
	}

}
