
import java.util.Scanner; //Scanner 클래스 사용하려면 필요함
public class ScanfEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체 생성, 원래라면 객체 생성하고 닫아줘야 함

//        int num = scanner.nextInt();
//        System.out.println(num);
        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine(); //입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); //입력받은 내용을 input 타입의 값으로 변환

        //위 두 문장을 한 문장으로 int num = scanner.nextInt(); 쓸 수 있음 알아두기
        System.out.println("입력내용 :"+ input);
        System.out.printf("num=%d%n", num);

    }
}
