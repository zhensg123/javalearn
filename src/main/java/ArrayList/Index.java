package ArrayList;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Index {
    public static void main(String[] args) {
        ArrayList<String> T1 = new ArrayList<String>();
        T1.add("测试1");
        T1.add("测试2");
        System.out.println(T1.get(0));
       for(String book:T1) {
           System.out.print(book);
        }

       T1.forEach((item)->{
         System.out.print(item);
       });

        Iterator<String> itr = T1.iterator();

        while(itr.hasNext()) {
            String book = itr.next();
            System.out.print(book);
        }

        ArrayList<Integer> I1 = new ArrayList<Integer>();
        I1.add(1);
        System.out.println(I1.get(0));


        ArrayList TT = new ArrayList(); // 如果没有规定类别，则表示什么类型的都可以
        TT.add(1);
        int aa[] = {11,12};
        TT.add(aa);

        System.out.print(TT);


    }
}
