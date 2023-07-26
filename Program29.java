package array_programs;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,6,9,12};
		int divider=3;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]/divider;
			System.out.print(arr[i]+" ");
		}
	}

}
