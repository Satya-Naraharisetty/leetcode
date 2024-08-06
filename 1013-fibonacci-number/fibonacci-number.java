class Solution {
    public int fib(int n) {
        if (n < 2){
            return n;
        }
        else{
            int a = 0;
            int b = 1;
            int curr = 0;
            for (int i = 2; i <= n; i++){
                curr = a + b;
                a = b;
                b = curr;
            }
            return curr;
        }
    }
}