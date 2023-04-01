//사용자로부터 반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총합을 출력하는 예제
import java.util.*;
public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

        while(flag) {
            System.out.print(">>");

            Scanner scanner = new Scanner(System.in);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num != 0) {
                sum = sum + num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 :" + sum);
    }
}
