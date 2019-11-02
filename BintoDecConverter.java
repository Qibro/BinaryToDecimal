import java.util.Scanner;
public class BintoDecConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int dec = 0;
        for (int i = 0; i < binary.length(); i++) {
            char bintemp = binary.charAt(i);
            if (bintemp == '1') {
                dec += Math.pow(2,binary.length()-i-1);
            }else{
                continue;
            }
        }
        System.out.println(dec);
    }
}