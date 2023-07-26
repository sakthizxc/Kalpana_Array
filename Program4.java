package array_programs;
//Linear search
public class Program4 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int no = 40;
		boolean noIsPresent = false;
for(int i=0; i<arr.length; i++) {
	if(arr[i]==no) {
		noIsPresent=true;
		
		System.out.println("The given no is present in the array at position: " + i);
		break;
	}
  }
if(noIsPresent==false) {
	
	
		 System.out.println("The given no is not present in the given array");
		
	}
	
}
		
	}


