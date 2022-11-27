public class ExeptionOne {

    public static void main(String[] args) {
        int num = 5;
        int num1 = 0;
        System.out.println(DelNull(num, num1));

    }

    public static int DelNull(int num, int num1) {
        int res = num / num1;
        return res;
    }
}
