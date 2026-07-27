class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=0;
        int right=position[position.length-1]-position[0];
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int current_placed=0;
            int bowls=1;
            for(int i=1;i<position.length;i++){
                if(position[i]-position[current_placed]>=mid){
                    current_placed=i;
                    bowls++;
                }
            }
            if(bowls>=m){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
        

    }
}