package array_programs;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr= {'d','h','e','e','e','n','a','h'};
	boolean check=false;
	//char dup='w';
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					count++;
					check=true;
				}
				
			}
			//dup=arr[i];
//			if(check==true)
//			break;
			
			
			
		}
		System.out.println("Count of Duplicate element is = "+count);
	}

}
