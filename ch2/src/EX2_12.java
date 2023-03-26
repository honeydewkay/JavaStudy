public class EX2_12 {
    public static void main(String args[]) {
        String str = "3"; //문자열

        System.out.println(str.charAt(0) - '0'); // 문자열 "3" -> 문자 '3' -> '3' -> 3 => 3
        System.out.println('3' - '0' + 1); // 문자 3 -> 숫자 '3' + 1 => 4
        System.out.println(Integer.parseInt("3") + 1); // "3" -> 3
        System.out.println("3" + 1); //"3" + "1" => "31"
        System.out.println(3 + '0'); // 3 -> '3' + '0' => '52'
    }
}
