public class reverseanarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = array.length;

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Reversed array:");
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
