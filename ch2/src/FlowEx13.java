//1부터 10까지 합 구하기
class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0; //합계 저장을 위한 변수, 0으로 초기화 해야 함.

        for (int i = 1; i <= 10; i++) {
            sum += i; //sum = sum + i
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum); // %2d = 2자리보다 작으면 여백을 추가해서 2자리를 확보 , %n = 줄바꿈
            // 첫 %2d = i ; 두번째 %2d = sum
        }
    }
}
