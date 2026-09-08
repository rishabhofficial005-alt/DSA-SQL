class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
    if ((long)m * k > bloomDay.length) {
    return -1;
}
     int start=Integer.MAX_VALUE;
     int end=Integer.MIN_VALUE;
     for(int day: bloomDay){
        start=Math.min(start,day);
        end=Math.max(end,day);
     }
     int ans=end;
    
     while(start<=end){
        int b=0; int c=0;
        int mid=(start)+(end-start)/2;
        for(int bloomday: bloomDay){
            if(bloomday<=mid){
                c++;
                if(c==k){
                    b++;
                    c=0;
                }
                
            }
            else{
                    c=0;
            }
            

        }
        if(b>=m){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        

     }
     return ans;   
    }
}