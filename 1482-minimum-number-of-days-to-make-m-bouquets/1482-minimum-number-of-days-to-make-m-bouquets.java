class Solution {
    public boolean midisValid(int[] bloomDay, int m, int k,int mid){
        int count=0;
        int b=0;
        for(int day: bloomDay){
            if(day<=mid){
                count++;
                if(count==k){
                    b++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        if(b>=m){
            return true;

        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int ans=0;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int days: bloomDay){
            low=Math.min(low,days);
            high=Math.max(high,days);
        }
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(midisValid(bloomDay,m,k,mid)){
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