public class SimpleArraySum{
    public static int simpleArraySum(int [] ar) {
        if(ar.length == 0){
            return 0;
        }else{
            int sum = 0;
            for(int i = 0; i < ar.length; i++){
                sum += ar[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int [] ar = {1,6,3};
        System.out.println(simpleArraySum(ar));
    }
}