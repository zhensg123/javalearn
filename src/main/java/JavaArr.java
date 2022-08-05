import java.sql.Array;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class JavaArr {
  public static void main(String[] args) {
      int arr[] = {2,23,23,23};
      for(int i = 0; i< arr.length; i++) {
          System.out.println(arr[i]);
      }
      int []ar2r = {3,34,34}; // 也是可以把中括号放在前面的
      Scanner sn = new Scanner(System.in);
      int n;
      while (true) {
          n = sn.nextInt();
          if(n == 0) {
              break;
          }
          System.out.println(n);
      }


      int arrs[][] = {{2,23,23,23}};
      int arr2[][] = new int[2][3];

      char ch = '1';
      System.out.println(ch);

  }
}
