import java.util.Arrays;


public class question1{
    public static void main(String[] args) {

        //question one of enthuware objective wise exams
        var a = new int[] {1,2,3,4,5};
        var b = new int[] {1,2,3,4,5,3};
        var c = new int[] {1,2,3,4,5,6};

        int x = Arrays.compare(a,c);
        int y = Arrays.compare(b,c);
        System.out.println(x+" "+y);

        
    }

}
