package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021118 鄭曉玫
 */
import java.util.Scanner;
public class ex06_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = 0;
		
		if( x < -1){
			  y =3*(int)Math.pow(x,2);
			  System.out.print(y);
		}else{
		if( -1 <= x && x <= 1){
			y = (int) Math.pow(x,3)+3*x-3;
			System.out.print(y);
		}else{
		if( x > 1){
			y = 2*x+3;
			System.out.print(y);
		}		
		}
		}

	}

}
