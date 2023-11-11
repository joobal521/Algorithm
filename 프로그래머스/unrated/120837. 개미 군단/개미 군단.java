class Solution {
    public int solution(int hp) {
        int answer = 0;
        //장군 개미 5, 병정개미 3, 일개미 1
        
        int king= hp/5;
        int army=(hp%5)/3;
        int work=((hp%5)%3)/1;
        answer=king+army+work;
        
        
        
        return answer;
    }
}