package array_programs;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr= {'a','b','a','c','d','b','e'};
		
		char nonRepeted=arr[0];
		boolean[] check=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				check[j]=true;
				check[i]=true;
				break;
			}
		}
		if(check[i]==false)
		{
			System.out.println(arr[i]);
			break;
			//System.out.println(i);
		}
			
		}
	}

}
