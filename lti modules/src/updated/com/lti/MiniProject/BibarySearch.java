package updated.com.lti.MiniProject;
//import java.util.*;

public class BibarySearch {
	public static void binarySearch(int A[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( A[mid] < key ){  
		        first = mid + 1;     
		      }else if ( A[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[]){  
		        int A[] = {10,20,30,40,50};  
		        int key = 50;  
		        int last=A.length-1;  
		        binarySearch(A,0,last,key);     
		 }  

}
