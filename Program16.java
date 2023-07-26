package array_programs;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		System.out.println("Before changing");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int last=arr[1];
		int S_last=arr[0];
		int i=0;
		while(i<arr.length-2) {
			arr[i]=arr[i+2];
			i++;
		}
		arr[i]=S_last;
		arr[i+1]=last;
		System.out.println();
		System.out.println("after changing");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
	}

}
