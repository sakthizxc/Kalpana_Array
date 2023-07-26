package array_programs;
//Moving all elements towards right in  a given array  
public class Program17 {
	public static void main(String[]arg) {
		int[] arr = {10,20,30,40,50};
		System.out.println("Before changing:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
		}
			int first=arr[arr.length-1];
			int j=arr.length-1;
			while(j>0)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=first;
			System.out.println();
			System.out.println("After changing");
			for(int k=0;k<arr.length;k++)
				{
				System.out.print(arr[k]+" ");
			}
	}
	


	}


