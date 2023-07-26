package array_programs;

public class Binary_search {
	public static void main(String[] args) {
		Binary_search bs = new Binary_search();
	 int position= bs.getBinarySearch();
	 if(position>0) {
		 System.out.println("Key is present " + position);
	 }
	 else {
		 System.out.println("key is not present");
	 }
	
		
	}
	private int getBinarySearch() {
		// TODO Auto-generated method stub
		
	
		int[] ar = {10,20,30,40,50,60,70,80};
		int key=70;
		int min=0;
		int max= ar.length-1;
		while(min<=max) {
			int mid= (min+max)/2;

			if(key==ar[mid]) {
        return mid;			
             }
			else if(key<ar[mid]){
				max=mid-1;
				
			}
			else {
				min=mid+1;
			}
		}
			return -1;
			
			
		}
		
	}
	
		// TODO Auto-generated method stub
		
	


