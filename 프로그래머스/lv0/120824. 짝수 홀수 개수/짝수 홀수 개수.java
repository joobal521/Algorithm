class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int x=0;
        int y=0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                x++;
            }else if(num_list[i]%2==1){
                y++;
            }
        }
        answer=new int[2];
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}