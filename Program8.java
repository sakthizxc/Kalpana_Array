package array_programs;
//How many times a given element is present in a given array
public class Program8 {
	public static void main (String[] args) {
		int[] arr= {92,95,97,82,97,80,97};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==97) {
				count++;
			}
		}
		System.out.println(count);

	}

}
