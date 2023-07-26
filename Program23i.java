package array_programs;
//Copying only the even indexed numbers in a given array
public class Program23i {
	public static void main(String[]args) {
		int [] a= {10,20,30,40,50};
		int len = a.length/2+1;
		int[] b= new int[len];
		int j=0;
		for(int i=0; i<a.length; i+=2) {
			b[j]=a[i];
			j++;

		}
		for(int i=0; i<b.length; i++) {

		System.out.print(b[i]+" ");

}
}
}