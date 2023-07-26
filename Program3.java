package array_programs;
//printing in reverse order
public class Program3 {
	public static void main(String[] args) {
		int[] ar = {92,90,88,100,95};
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+ " ");
		}
	}

}
