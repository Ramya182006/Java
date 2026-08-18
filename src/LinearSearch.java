import java.util.Scanner;
public class LinearSearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] arr = {6, 7, 8, 4, 1};
            boolean found = false;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == num)
                {
                    found = true;
                    break;
                }
            }
            if(found)
            {
                System.out.println("Element Found");
            }
            else
            {
                System.out.println("Element NotFound");
            }
        }
}

