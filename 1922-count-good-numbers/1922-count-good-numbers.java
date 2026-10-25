class Solution {
    static final long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=(n)/2;
        long a= result(5,even);
        long b=result(4,odd);
        return (int) ((a*b)%mod);
        
    }
    private long result(long x, long n){
        long ans = 1;

        while (n > 0) {
            if (n % 2 != 0) {
                ans = (ans * x) % mod;
            }

            x = (x * x) % mod;
            n = n / 2;
        }

        return ans;
    }
}
