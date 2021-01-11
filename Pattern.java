package zohoSet1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =0;
		for(int i=n;i>=1;i--)
		{
			//System.out.println(n+" ");
			for(int j=n;j>=i;j--)
			{
			
				    System.out.print(j + " ");
				 
				    temp = j;
					
			}
			for(int k =n-i+1;k<n;k++)
			{
				
					System.out.println(temp +" ");
			}
			//n--;
			System.out.println();
		}
        sc.close();
	}

}
