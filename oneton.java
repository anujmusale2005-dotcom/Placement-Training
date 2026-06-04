class Solution {

    static void print1toN(int n) {
        if (n == 0) {
            return;
        }

        print1toN(n - 1);      // go deeper first
        System.out.println(n); // print while returning
    }

    public static void main(String[] args) {
        int n = 10;
        print1toN(n);
    }
}