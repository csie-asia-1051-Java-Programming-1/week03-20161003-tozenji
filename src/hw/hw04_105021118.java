package hw;
import java.util.Scanner;
public class hw04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n,i=1,sum=0;
		do{
			System.out.print("½Ð¿é¤J­È:") ;
			n=scn.nextInt();
			
		}while(n<1);
		do
			sum*=i;
		    
		while(i<=n);
		
		System.out.print("1*2*...*"+n+"="+sum) ;
		
	}

}
