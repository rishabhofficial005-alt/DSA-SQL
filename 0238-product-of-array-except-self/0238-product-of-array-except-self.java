class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int preffixproduct[]=new int[n];
        int suffixproduct[]=new int[n];
        int ans[]=new int[n];
        preffixproduct[0]=1;
        suffixproduct[n-1]=1;
        for(int i=1;i<n;i++){
            preffixproduct[i]=preffixproduct[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffixproduct[i]=suffixproduct[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=preffixproduct[i]*suffixproduct[i];
        }
        return ans;
    }
}