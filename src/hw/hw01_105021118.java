package hw;
import java.util.Scanner;
public class hw01_105021118 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		{
			
		String test;
		
		System.out.print("��J�@�ӥ���ƭ�(���t 0)");
		Scanner scn = new Scanner(System.in);
		test=scn.next();
		int i=Integer.parseInt(test);
		int j=0;
		
		System.out.print("�Ǧ^"+digits(i,j)+"���");
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
