public class HappyNumber {
    public static boolean isHappyNumber(int n) {

        // Replace this placeholder return statement with your code
        int slow=n;
        int fast=sumSqr(n);
        while(fast!=1 && fast!=slow) {
            slow = sumSqr(slow);
            fast =sumSqr(sumSqr(fast));
        }

        return fast==1;
    }

    public static int sumSqr(int n) {
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+=(digit*digit);
            n=n/10;
        }
        return sum;
    }

    public static void main(String [] args){
        HappyNumber.isHappyNumber(4);
    }
}
