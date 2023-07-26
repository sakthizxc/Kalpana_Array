package array_programs;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,6,7,3,2,7,5,3};
		int no=0;
		boolean bl=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("First repeated Element is = "+arr[i]);
					bl=true;
				}
			}
			if(bl==true)
			{
				break;
			}
		}
	}

}
