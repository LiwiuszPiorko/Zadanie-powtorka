import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        int[]array={2,39,9,4,2,3,4,1};
        Methods check=new Methods();
        check.array(array);
       String arrayString = Arrays.toString(array);
        System.out.println(arrayString);

    }
}
