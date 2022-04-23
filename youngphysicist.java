import java.util.Scanner;

public class youngphysicist {
    public boolean checkSum(int n,int x[][]){
        int[] sums = new int[3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                sums[j] += x[i][j];
        if (sums[0] == 0 && sums[1] == 0 && sums[2] == 0) {
            System.out.println("YES");
            return true;
        } else {
            System.out.println("NO");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] x = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                x[i][j] = in.nextInt();
        var young = new youngphysicist();
        young.checkSum(n,x);
    }
}
