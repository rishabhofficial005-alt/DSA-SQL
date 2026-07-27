class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
      int low=1;
      int high = 10000000;;
      int ans=-1;
      
      while(low<=high){
        int mid=low+(high-low)/2;
        double hours=0.0;
           for(int i=0;i<dist.length;i++){
            if(i==dist.length-1){
                hours+=(double)(dist[i])/mid;
            }
            else{
                hours+=Math.ceil((double)(dist[i])/mid);
            }
           }
        if(hours<=hour){
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