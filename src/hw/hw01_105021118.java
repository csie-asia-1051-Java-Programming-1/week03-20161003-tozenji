package hw;
import java.util.Scanner;
public class hw01_105021118 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		{
			
		String test;
		
		System.out.print("輸入一個正整數值(不含 0)");
		Scanner scn = new Scanner(System.in);
		test=scn.next();
		int i=Integer.parseInt(test);
		int j=0;
		
		System.out.print("傳回"+digits(i,j)+"位數");
	}
		public static int digits(int m,n)
		{
			if(m!=0)
			{
				n++;
				
				return digits(m/10,n);
			}
			else{
				return ;
			}
		}
	}

}
