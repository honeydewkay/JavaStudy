import java.util.Scanner;

//사용자가 단수 입력하면 구구단 출력되게
public class gugudan {
    public static void main (String[] args) {
        System.out.print("구구단 첫번째 수를 입력하세요(2~9) : ");
        Scanner scanner1 = new Scanner(System.in);
        int i = scanner1.nextInt();

        System.out.print("구구단 두번째 수를 입력하세요(2~9) : ");
        Scanner scanner2 = new Scanner(System.in);
        int j = scanner2.nextInt();


            for(; j>=1;j--) {
                System.out.printf("%2d X %2d = %2d%n", i, j, i*j);
            }

    }
}
