public class main{
        public static void main(String[] args) {
            int[] arr = {2,4,1,5,3};
            boolean sorted = true;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    sorted = false;
                    break;
                }
            }
            if(sorted)
            {
                System.out.println("sorted");
            }
            else{
                System.out.println("unsorted");
            }

        }

}
