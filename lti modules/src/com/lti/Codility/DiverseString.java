package com.lti.Codility;

public class DiverseString {
	static void generateString(int X, int Y,int Z)  
    { 
     String val= ""; 
     while (0 < X || 0 < Y || 0 < Z)  
        { 
  
        
         if (X > Y && X > Z) 
          { 
          if (0 < Y--) 
          { 
          val += ('b'); 
          } 
          if (0 < Y--)  
          { 
          val += ('b'); 
            }
          //if (0 < Y--) 
         // { 
          //val += ('b'); 
         // }
           if (0 < X--)  
           { 
           val += ('a'); 
           } 
            if (0 < Z--)  
            { 
            val += ('c'); 
             } 
            }  
              
           
            else if (Y > X && Y > Z)
            { 
                if (0 < X--)  
                { 
                    val += ('a'); 
                } 
                if (0 < X--)  
                { 
                    val += ('a'); 
                } 
               // if (0 < X--)  
                //{ 
                //val += ('a'); 
               // } 
               // if (0 < Y--)  
                { 
                    val += ('b'); 
                } 
                if (0 < Z--)  
                { 
                    val += ('c'); 
                } 
            } 
            else if (Z > X && Z > Y)
            { 
                if (0 < Z--)  
                { 
                    val += ('c'); 
                } 
                if (0 < Z--)  
                { 
                    val += ('c'); 
                } 
                //if (0 < Z--)  
                //{ 
                    //val += ('c'); 
                //} 
                if (0 < X--)  
                { 
                    val += ('a'); 
                } 
                if (0 < Y--)  
                { 
                    val += ('b'); 
                } 
            }  
         
              
            
            else
            { 
                if (0 < X--)  
                { 
                    val += ('a'); 
                } 
                if (0 < Y--)  
                { 
                    val += ('b'); 
                }
                if (0 < Z--)  
                { 
                    val += ('c'); 
                } 
            } 
        } 
        System.out.println(val); 
    } 
  
  
	
	
    public static void main(String[] args)  
    { 
        int X= 2, Y = 6, Z= 2; 
        generateString(X, Y, Z); 
    } 
}  
  

	
	
