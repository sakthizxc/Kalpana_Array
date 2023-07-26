package array_programs;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		System.out.println("Before changing");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int i0=arr[arr.length-2];
		int i1=arr[arr.length-1];
		int j=arr.length-1;
		while(j>1)
		{
			arr[j]=arr[j-2];
			j--;
		}
		arr[j]=i1;
		arr[j-1]=i0;
		System.out.println();
		System.out.println("After Changing");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}

}
