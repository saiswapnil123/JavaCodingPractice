import java.util.*;

public class Pattern4{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  int j ;
    for(int i = 1; i<=n; i++){
      for(j = n-i; j!=0;j--){
        System.out.print(" ");
      }

      for(; j<i; j++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
/*
    *
   **
  ***
 ****
*****
*/