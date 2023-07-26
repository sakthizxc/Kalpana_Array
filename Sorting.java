package array_programs;

import java.util.Scanner;

//Bubble sort Ascending order
public class Sorting {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
	int len=	sc.nextInt();
	int[] ar = new int[len];
	for(int i=0; i<ar.length; i++) {
		System.out.println("Enter the value");
		ar[i]=sc.nextInt();
	}
		//int[] ar = {50,40,30,20,10};
		int j=1;
		while(j<=ar.length) {
			int i=0;
		while(i<ar.length-j)
		{
			if(ar[i]>ar[i+1])
			{
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
		
		}
			i++;
		}
		j++;
		}
			for( int k=0; k<ar.length;k++) {
				System.out.print(ar[k]+ " ");
				
			}
		}
	}



