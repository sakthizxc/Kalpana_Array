package array_programs;
//Addition of two integer arrays
public class Program20 {
	public static void main(String[] args) {
		int[] a = {10,20,30,60,70};
		int[] b = {40,50};
		int len = a.length>b.length?a.length:b.length;
		int[] c = new int[len];
		int i=0;
		int small = a.length<b.length?a.length:b.length;
		for( i=0; i<small; i++) {
			c[i] = a[i]+b[i];
			
			
		}
		while(i<a.length) {
			
		
		c[i]=a[i];
		i++;	
		}
		System.out.println("New array values are: ");
		for(i=0; i<c.length; i++) {
		System.out.print( c[i]+ " ");
	}

}
}