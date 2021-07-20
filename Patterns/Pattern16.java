import java.util.Scanner;

public class Pattern16{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  int sp_ref = 2*(n-1);
  int st_ref = n;
    for(int i = 0; i<n+(n-1); i++){
      for(int j = 0; j<sp_ref;j++){
        System.out.print(" ");
      }
      for(int j = 0; j<st_ref; j++){
        System.out.print(" *");
      }
      if(i>=(n+(n-1))/2)
      {
        st_ref += 1;
        sp_ref += 2;
      }
      else{
      st_ref -= 1;
      sp_ref -= 2;
      }
      System.out.println();
    }
  }
}
/*
                     * * * * * * * * * * *
                   * * * * * * * * * *
                 * * * * * * * * *
               * * * * * * * *
             * * * * * * *
           * * * * * *
         * * * * *
       * * * *
     * * *
   * *
 *
   * *
     * * *
       * * * *
         * * * * *
           * * * * * *
             * * * * * * *
               * * * * * * * *
                 * * * * * * * * *
                   * * * * * * * * * *
                     * * * * * * * * * * *
                     */
/*
        * * * * * 
      * * * * 
    * * * 
  * * 
* 
  * * 
    * * * 
      * * * * 
        * * * * * 
*/