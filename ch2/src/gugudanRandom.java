import java.util.*;
public class gugudanRandom {
    public static void main (String[] args) {

        int i = (int)Math.floor(Math.random()*10);
        int j = (int)Math.floor(Math.random()*10);

        for(; j>=1;j--) {
            System.out.printf("%2d X %2d = %2d%n", i, j, i*j);
        }
    }
}
