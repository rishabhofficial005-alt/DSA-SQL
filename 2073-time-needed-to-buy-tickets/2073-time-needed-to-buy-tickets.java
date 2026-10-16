import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time=0;
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int person=q.poll();
            tickets[person]--;
            time++;
            if(tickets[person]>0){
                q.offer(person);
            }
            if(k==person && tickets[person]==0){
                return time;
            }
        }
        return time;
    }
}