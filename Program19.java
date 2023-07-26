package array_programs;
//Copying the given array to another array in reverse order
public class Program19 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= new int[a.length];
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		int i = 0;
		int j= a.length-1;
		int temp=0;
		while(i!=j) {

			 temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;

		}

		System.out.println();
		for( i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
		
			
		}
		
	}

}

