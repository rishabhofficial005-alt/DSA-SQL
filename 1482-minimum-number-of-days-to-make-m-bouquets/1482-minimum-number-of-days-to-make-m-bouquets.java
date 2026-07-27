class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int ans=-1;
        for(int day : bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            int mid=(low)+(high-low)/2;
            int count=0;
            int bookey=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                   count++;
                   if(count==k){
                    bookey++;
                    count=0;
                   }
                }
                else{
                    count=0;
                }
            }
            if(bookey>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}