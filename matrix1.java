//Implement java program to perform 2*2 matrix addition and multiplication.
//save matrix1.java

public class matrix1
{      
    public static void main(String args[])
    {        
     int a[][]={{2,2,2},{2,2,2}};    
     int b[][]={{2,2,2},{2,2,2}};    
     int sum[][]=new int[2][2];   
       
     int c[][]=new int[2][2];  
        
         
     for(int i=0;i<2;i++)
     {    
      for(int j=0;j<2;j++)
      {    
       c[i][j]=0;      
       for(int k=0;k<2;k++)      
       {      
       c[i][j]+=a[i][k]*b[k][j];      
       }
       System.out.print(c[i][j]+" ");  
      }
      System.out.println();
     }
     System.out.println("Addition of Matrix");  

     for(int i=0;i<2;i++)
     {    
      for(int j=0;j<2;j++)
      {                
       sum[i][j]=a[i][j]+b[i][j];  
       System.out.print(sum[i][j]+" "); 
      }
      System.out.println();
    } 
    
       
   }
} 
