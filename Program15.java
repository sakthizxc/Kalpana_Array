package array_programs;
//Moving all elements towards left in a given array
public class Program15 {
	public static void main (String[]args) {
		int[] arr = {10,20,30,40,50};
		System.out.println("Before changing: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int temp=arr[0];
		int i=0;
while(i<arr.length-1) {
	
	arr[i]=arr[i+1];
	i++;
			
		}
		arr[i]=temp;
		System.out.println();
		System.out.println("After changing: ");
		for( i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		
	}

}
}