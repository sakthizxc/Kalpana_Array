package array_programs;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {1,2,1,4,3,5,4,1,};
		int count=1;
		int[] arr3=new int[count-1];
		int l=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count++;
					}
				}
			}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					
				}
			
				}
		
	}
		
		System.out.println();
		System.out.println("Count of duplicate is = "+count);
		}
}
