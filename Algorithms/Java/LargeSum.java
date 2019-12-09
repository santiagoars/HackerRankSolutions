public class LargeSum{
    public static void main(String[] args) {
        long [] a = {10000, 20000, 30000, 40000};
        System.out.println(aVeryBigSum(a));
    }

    public static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }
}