import java.util.Scanner;

public class Pattern6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
      for(int j = i; j<= i*3; j++)
      {
        System.out.print(" ");
      }
      for(int j = i; j<=n;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    }
}