package array_programs;
//Frequency of each element in a given array
public class Ex1 {
	public static void main(String[] args) {
		int[] a={10,20,30,40,50,10,20,30,40,50,10,20,30,80};
		int[] freq= new int[a.length];

		for(int i=0; i<a.length; i++) {
			int no=a[i];
			int count=1;

			for(int j=i+1; j<a.length; j++) {
				if(no==a[j]) {
					count++;
					freq[j]=-1;
					
				}
			}
			if(freq[i]!=-1)
			freq[i]=count;
		}
			for( int i=0;i<freq.length;i++) {
				if(freq[i]>0)
				System.out.println(a[i]+ " occurs "+ freq[i]+ " times ");
			}
		}
		
		
	}
	


