public class JavaFunction {
    public void printStart(){
        System.out.println("===========");
    }
    public  int area(){
        int width = 90;
        int height = 8;
        return width * height;
    }
    public static void main(String[] args) {
        JavaFunction javafx = new JavaFunction();
        javafx.printStart();
        System.out.println("输出什么语句");
        javafx.printStart();
        System.out.println(javafx.area());

        // 秋最大值
        float a = 1, b= 6;
        System.out.println(javafx.max(a, b));
//
//        javafx.sum(2, 2);
//        javafx.sum(2, 4, 5);
//        javafx.sum(2, 3);
    }


    public  float max(float a, float b){
        float max;
       if(a > b) {
           max = a;
       }else {
           max = b;
       }
       return max;
    }


    public  void sum(int... n) {
        int sum = 0;
        for(int  i:n) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
    public  void sum(int a, int... n) {
        int sum = 0;
        for(int  i:n) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
