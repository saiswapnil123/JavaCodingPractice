import java.util.*;

public class Pattern10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i<n; i++){
      for(int j = 0; j < i; j++){
        System.out.print(" ");
      }
      for(int k = 0; k<n+(n-1) - 2*i; k++){
        System.out.print("*");
      }
      for(int j = 0; j < i; j++){
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
/*
*********************
 ******************* 
  *****************  
   ***************   
    *************    
     ***********     
      *********      
       *******       
        *****        
         ***         
          *  
          */