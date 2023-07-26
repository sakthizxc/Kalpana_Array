package array_programs;
//Find the smallest number in a given array
public class Program10 {
	public static void main(String[]args) {
		int[] arr = {92,100,80,75,90,88};
		int min = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
				}
				
			}
			
			}
		System.out.println(min);
		}
		
	}


