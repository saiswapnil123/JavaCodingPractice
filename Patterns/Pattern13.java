import java.util.Scanner;

public class Pattern13{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  int  k= 1;
    for(int i = 1; i<= n+(n-1); i++){
      int j = i;
      if(j > n){
        j = i-(2*k);
        k++;
      }
      else
        j = i;
      for(; j>0; j--){
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
****
***
**
*
*/