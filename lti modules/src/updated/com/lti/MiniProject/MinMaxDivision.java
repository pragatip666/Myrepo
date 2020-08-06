package updated.com.lti.MiniProject;

public class MinMaxDivision {
	public int solutions(int K, int M, int[] A) {
		int N = A.length;
		int sum = 0;
		int max= 0;
		
		for(int  no: A) {
			sum += no;
		 if(no > max)
			max = no;
		
		 }
	    System.out.println("total sum " + sum);
	    System.out.println("max val " +  max);
		  int beg = max;
		  int end = sum;
		  while(beg < end){
			  //int mid = beg +(end- beg) / 2;
			  int mid = (beg + end)/2;
			  int slices = noOfSlices(mid,A);
			  if(slices <= K)
				  end = mid;
			  else
				  beg = mid+1;
			  
		  }
		  return beg;
			  
		  }

     private int noOfSlices(int no, int[] A)
    {
	int noOfSlices = 1;
	int sum = 0;
	for (int a: A)
	{
		if(a + sum > no)
		{
			noOfSlices++;
			sum = a;
		}
		else 
			sum += a;
		
		}
	    return noOfSlices;
	}
public static void main(String [] args)
{ 
	int K = 3;
	int M = 5;
	int [] A= {2,1,5,1,2,2,2};
	System.out.println(new MinMaxDivision().noOfSlices(7,A));
	
	System.out.println(new MinMaxDivision().solutions(K,M,A));
}

}
