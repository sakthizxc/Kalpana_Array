package array_programs;
// Copying only the odd index in a given array to another arrary
public class Program23 {
public static void main(String[] args) {
	int[] a = {10,20,30,40,50};
	int len = a.length/2;
	int [] b = new int[len];
	int j=0;
		for(int i=1; i<a.length; i+=2) {
			
			b[j]=a[i];
				j++;
		}
		
			for(int i=0;i<b.length; i++) {
			System.out.print(b[i]+" ");
		
			
	}
	
}
}
