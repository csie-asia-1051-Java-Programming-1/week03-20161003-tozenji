package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021118 鄭曉玫
 */
import java.util.Scanner;
public class ex01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str=scn.next();
		char[]data=str.toCharArray();
		for (int i =data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}
		}
	


}
