package array_programs;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {21,34,5,4,54};
		int remove=34;
		int j=0;
		int[] arr2=new int[arr1.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			if(remove!=arr1[i])
			{
				arr2[j]=arr1[i];
				j++;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
