import java.util.Scanner;

public class NumberChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count : ");
        int row = sc.nextInt();

        for (int i=1;i<=row;i++){
            for (int j=0;j<row-i;j++){
                System.out.print("  ");
            }

            for (int j=0;j<i*2-1;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
