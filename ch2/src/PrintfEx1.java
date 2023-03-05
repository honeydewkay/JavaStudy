public class PrintfEx1 {
    public static void main(String[] args) {
//        System.out.println(10.0/3);
//        System.out.printf("%d%n", 15);
//        System.out.printf("%o%n", 15);
//        System.out.printf("%x%n", 15);
//        System.out.printf("%s", Integer.toBinaryString(15));

//        double f = 123.45678;
//        System.out.printf("%f%n", f);
//        System.out.printf("%e%n", f);
//        System.out.printf("%g%n", f);
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;

//        double d = 1.23456789

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.println(""+url);

//        System.out.printf("[%5d]%n", 1234567); //다 나옴 [1234567]
//        System.out.printf("[%-5d]%n", 10);
//        System.out.printf("[%05d]%n", 10);
//
//        double d = 1.23456789;
//        System.out.printf("%.6f%n", d);
//
//        System.out.printf("[%s]%n", "www.codechobo.com");
//        System.out.printf("[%.10s]", "www.codechobo.com"); //[www.codech] //왼쪽에서 10자만 출력
    }
}
