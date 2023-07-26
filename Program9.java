
package array_programs;
//Find biggest or maximum number in a given array
public class Program9 {
public static void main(String[] args) {
	int[] arr = {97,92,80,100,98,95};
	int max=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
			max= arr[i];

		}
	}
	System.out.println(max);

}
}
