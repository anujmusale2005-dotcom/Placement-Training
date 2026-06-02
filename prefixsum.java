public class prefixsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        System.out.print("Input: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" = ");
        
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i]);
            if (i < prefixSum.length - 1) {
                System.out.print(",");
            }
        }
    }
}
