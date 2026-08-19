public class UnionArray {
        public static void main(String[] args) {
            int[] arr1 = {1, 1, 2, 3, 4, 5};
            int[] arr2 = {2, 3, 4, 4, 5, 6};
            int i = 0, j = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    while (i + 1 < arr1.length && arr1[i] == arr1[i + 1]) {
                        i++;
                    }
                    i++;
                }
                else if (arr1[i] > arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    while (j + 1 < arr2.length && arr2[j] == arr2[j + 1]) {
                        j++;
                    }
                    j++;
                }
                else {
                    System.out.print(arr1[i] + " ");
                    while (i + 1 < arr1.length && arr1[i] == arr1[i + 1]) {
                        i++;
                    }
                    while (j + 1 < arr2.length && arr2[j] == arr2[j + 1]) {
                        j++;
                    }
                    i++;
                    j++;
                }
            }
            while (i < arr1.length) {
                System.out.print(arr1[i] + " ");
                while (i + 1 < arr1.length && arr1[i] == arr1[i + 1]) {
                    i++;
                }
                i++;
            }
            while (j < arr2.length) {
                System.out.print(arr2[j] + " ");
                while (j + 1 < arr2.length && arr2[j] == arr2[j + 1]) {
                    j++;
                }
                j++;
            }
        }

}
