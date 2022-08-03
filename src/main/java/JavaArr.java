import java.util.Scanner;

public class JavaArr {
  public static void main(String[] args) {
      int arr[] = {2,23,23,23};
      for(int i = 0; i< arr.length; i++) {
          System.out.println(arr[i]);
      }

      Scanner sn = new Scanner(System.in);
      int n;
      while (true) {
          n = sn.nextInt();
          if(n == 0) {
              break;
          }
          System.out.println(n);
      }
  }
}
