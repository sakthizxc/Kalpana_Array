package array_programs;
//Finding first two biggest number in a given array
public class Program11 {
	public static void main(String[] args) {
		int [] arr = {10,20,60,40,50};
		int max=0;
		int secondMax=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
				else if(arr[i]>secondMax) {
					secondMax=arr[i];
					
				}
				
			}
		System.out.println(max + " " + secondMax );

		}
	}


