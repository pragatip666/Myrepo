package updated.com.lti.MiniProject;

public class TraianglesCatterpilar {
	public static  int triangles(int[] A) {
		//A [] =  {2,4,6};
		int n = A.length;
		int result = 0;
		for(int x = 1;x< n;x++) {
			int z = x + 2;
			for(int y = x+1;y< n;y++) {
				while (z < n && A[x] + A[y] > A[z]) {
					z += 1;
				}
			result += z - y - 1;
					
				}
				
			
		 return result;
		}
		return 1;
		System.out.println(result);
		}
	 
			
		}
		
		
		
		
		
	


