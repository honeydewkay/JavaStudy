class VarEx1 {
    public static void main(String[] args) {
        /*
        int year = 0;
        int age = 14; //초기화
        System.out.println(year);
        System.out.println(age);
        year = age + 2000; // age에 저장된 값에 2000 더해서 year에 저장
        age = age + 1; //변수의 값을 읽어서 1을 더한 다음에 다시 변수 age에 저장
        System.out.println(year);
        System.out.println(age);

        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:"+ x + " y:" + y );

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:"+ x + " y:" + y);
*/
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(""+name);
        System.out.print(name);
        System.out.print(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + 7 + ""); //14
        System.out.println("" + 7 + 7); //77
    }
}