import java.util.*;

public class Pattern12{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for(int i = 1; i<=n;i++){
      for(int j = 1; j<=(n-i)*2;j++){
        System.out.print(" ");
      }
      for(int k = 1; k<=2*i - 1; k++){
        if(k %2 == 0)
          System.out.print("!");
        else
          System.out.print(" * ");
      }
      for(int j = 1; j<(n-i)*2;j++){
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
/*
                     *                    
                   * ! *                  
                 * ! * ! *                
               * ! * ! * ! *              
             * ! * ! * ! * ! *            
           * ! * ! * ! * ! * ! *          
         * ! * ! * ! * ! * ! * ! *        
       * ! * ! * ! * ! * ! * ! * ! *      
     * ! * ! * ! * ! * ! * ! * ! * ! *    
   * ! * ! * ! * ! * ! * ! * ! * ! * ! *  
 * ! * ! * ! * ! * ! * ! * ! * ! * ! * ! * 
 */