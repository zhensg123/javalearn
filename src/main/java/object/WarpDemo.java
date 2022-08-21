package object;

public class WarpDemo {
     public static void main(String[] args) {
        int t1 = 2;
        // 自动
         Integer t2 = t1;

         // 手动
         Integer t3 = new Integer(t1);
         System.out.println(t2);

         // 拆箱 自动
         int t4 = t2;

         // 手动
         int t5 = t2.intValue();

         String t6 = t2.toString();


         int t7 = Integer.parseInt(t6);
         int t8 = Integer.valueOf(t6);



    }
}
