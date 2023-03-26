public class Main {

    public static void main(String[] args) {

        EX2 Kim = new EX2(100, "김현주"); //클래스 = EX2 ,

        Kim.koreaSubject("국어", 100, 5);
        Kim.setMathSubject("수학", 80, 10);
        Kim.showscore();
        Kim.showID();

    }
}
