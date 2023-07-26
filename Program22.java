package array_programs;
//Copying only the negative numbers in a given array to another array
public class Program22 {
	public static void main(String[] args) {
	int[] arr1= {4,-8,5,-6,3,-7,-1,-5,2};
	int count=0;
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]<0)
		{
			count++;
		}
	}
	System.out.println(count);

	int[] arr2=new int[count];
	int j=0;
	for(int i=0;i<arr1.length;i++)
	{
				if(arr1[i]<0)
				{
				arr2[j]=arr1[i];
				j++;
			}
			}
	for(int k=0;k<arr2.length;k++)
	{
		System.out.print(arr2[k]+" ");
	}
}
}
