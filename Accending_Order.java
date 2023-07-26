package array_programs;
//Finding two smallest number in a given array
public class Accending_Order {
	public static void main(String[] args) {
		int[] arr = {10,20,30,60,40,15,50};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.print(arr[i]+" ");
		
			
		}
		
		
	}

}
