import java.util.*;

public class Pattern9{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i<n; i++){
      for(int j = 0; j<(n-i); j++){
        System.out.print(" ");
      }
      for(int k = 1; k<=1+2*i; k++){
        System.out.print("*");
      }
     for(int j = 0; j<(n-i); j++){
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
/*
          *          
         ***         
        *****        
       *******       
      *********      
     ***********     
    *************    
   ***************   
  *****************  
 ******************* 
 */