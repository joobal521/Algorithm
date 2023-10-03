class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]==n){
                answer=1;
                break; //찾았으면 반복문 종료
            }else{
                answer=0;
            }
        }
        
        return answer;
    }
}