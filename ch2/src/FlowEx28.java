import java.util.*;
public class FlowEx28 {
    public static void main(String[] args) {

        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1 ; //1~100까지 난수 저장
        Scanner scanner = new Scanner(System.in);

        do {
            //조건식 참일 때 수행
            System.out.println("1~100 사이 정수를 입력하세요 :");
            input = scanner.nextInt();

            if(input > answer) {
                // input이 클 때
                System.out.println(" 더 작은 수를 입력하세요");
            } else if(input < answer) {
                // input이 작을 때
                System.out.println(" 더 큰 수를 입력하세요");
            }

        } while(input != answer); //조건식
        System.out.println("정답입니다.");
    }
}
