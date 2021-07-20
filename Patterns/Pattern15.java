import java.util.Scanner;

public class Pattern15{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int rows = (2*n) - 1;
    int st_ref = n;
    int sp_ref = 0;

    for(int i=1;i<=rows;i++)
    {
      for(int j=1;j<=sp_ref;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=st_ref;j++)
      {
        System.out.print("* ");
      }

      if(i<=rows/2)
      {
        st_ref = st_ref - 1;
        sp_ref = sp_ref + 4;
      }
      else
      {
        st_ref = st_ref + 1;
        sp_ref = sp_ref - 4;
      }
      System.out.println();
    }
  }
}
/*
* * * * 
    * * * 
        * * 
            * 
        * * 
    * * * 
* * * * 
*/

