import java.util.Scanner;

public class watermelon {
        public boolean testeven(int weight) {
            boolean iseven = false;
            if(weight>2)
                {
                    if ((weight % 2) == 0) {
                        System.out.println("YES");
                        iseven=true;
                        return iseven;
                    }
                    else {
                        System.out.println("NO");
                        iseven = false;
                        return iseven;
                    }
                }
            else{
                    System.out.println("NO");
                    iseven=false;
                    return iseven;}
            }
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int w;
                w = in.nextInt();
                var water = new watermelon();
                water.testeven(w);
            }
    }
