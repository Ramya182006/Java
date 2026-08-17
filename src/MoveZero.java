public class MoveZero {
        public static void main(String[] args)
        {
            int[] arr = {1,2,0,0,5,4,0,6,0,8};
            int j=-1;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0)
                {
                    j=i;
                    break;
                }
            }
            int temp;
            for(int i=j+1;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;

                }
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
}
