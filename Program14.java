package array_programs;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,4,1,6,3,8,9,5};
		int sum=0;
		for(int i=1;i<arr.length;i=i+2)
		{
			sum=sum+arr[i];
		}
		System.out.println("Addition of odd index = "+sum);
	}

}
