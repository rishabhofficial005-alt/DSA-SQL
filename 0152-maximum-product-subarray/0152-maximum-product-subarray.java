class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max_product=Integer.MIN_VALUE;
        int preffix_product=1;
        int suffix_product=1;
        for(int i=0;i<n;i++){
            if(preffix_product==0) preffix_product=1;
            if(suffix_product==0) suffix_product=1;
            preffix_product*=nums[i];
            suffix_product*=nums[n-1-i];
            max_product=Math.max(max_product,Math.max(preffix_product,suffix_product));
        }
        return max_product;
    }
}