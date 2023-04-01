//1부터 몇까지 더하면 누적합계가 100 안 넘는 큰 수가 될지

public class FlowEx26 {
    public static void main (String[] args) {
        int i=0;
        int sum = 0;

        while( sum <= 100 ) {
            System.out.printf("%2d - %2d %n", i , sum);
            sum = sum + ++i;
        }
    }
}
