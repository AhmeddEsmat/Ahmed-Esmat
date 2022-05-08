import java.util.Scanner;

public class EvenAndOdd {
    public String check(int x){
        if(x % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        var checker = new EvenAndOdd();
        checker.check(x);
    }
}
