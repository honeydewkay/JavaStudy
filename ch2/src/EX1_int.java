import java.util.*;


public class EX1_int {
    // 커피 가격 계산 메소드
    // 커피 가격은 숫자형


    public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("정수를 입력해주세요 :");
//       String input = scanner.nextLine();
//       int num = Integer.parseInt(input);
        int a = 5;
        int b = 10;
        System.out.println(Integer.max(a,b));

        //int a = scanner.nextInt();




//       if(num < 2147483647){
//           System.out.println("입력한 정수의 범위가 초과되었습니다.");
//       }else{
//           return;
//       }
//
//
//       num = num * 10000;
//        if (num > 2147483647) { //오버플로우
//            System.out.println("오버플로 입니다");
//        } else if (num <= -2147483647) {
//            System.out.println("오버플로 입니다");
//        } else {
//            System.out.println("값은 " + num  + " 입니다"); //조건 오버플로우 값
////            System.out.println("값은 " + sum  + " 입니다"); //오버플로우 아닌 검증값
//        }


//       int MAX = Integer.MAX_VALUE;
//       System.out.println(MAX);
//
//       num = ++num;



//        byte num = -120;
//        byte sum;
//        byte a;
//        a = num++;
//        sum = ++num;
//        if (num > 2147483647) { //오버플로우
//            System.out.println("오버플로 입니다");
//        } else if (num <= -2147483647) {
//            System.out.println("오버플로 입니다");
//        } else {
//            System.out.println("값은 " + num  + " 입니다"); //조건 오버플로우 값
////            System.out.println("값은 " + sum  + " 입니다"); //오버플로우 아닌 검증값
//        }
//
        /*
        int i = -120;
        int j = 0;

        먼저 i를 1 증가 시킴(-119)
        i의 값을 참조해서 j에 대입(-119)

        j = ++i;
        System.out.println("i"+i);
        System.out.println("j"+j);



        k 가 b 값을 참조(-120);
        연산 결과를 k에 저장 (-120)
        b ++(1)증가 시킴(-119)
        int b = -120;
        int k = 0;
        k = b++;
        System.out.println("b"+b);
        System.out.println("k"+k);
        */

    }
}