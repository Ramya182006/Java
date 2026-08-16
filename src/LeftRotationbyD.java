import java.util.Scanner;
public class LeftRotationbyD {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.print("Enter D: ");
            int D = sc.nextInt();
            int[] temp = new int[D];
            for (int i = 0; i < D; i++) {
                temp[i] = arr[i];
            }
            for (int i = D; i < arr.length; i++) {
                arr[i - D] = arr[i];
            }
            for (int i = 0; i < D; i++) {
                arr[arr.length - D + i] = temp[i];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] );
            }
    }
}
