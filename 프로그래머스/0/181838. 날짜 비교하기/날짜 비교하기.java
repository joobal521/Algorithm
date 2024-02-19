class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        //#1 년도(year) 비교
        if(date1[0]<date2[2]){
            answer=1;
        }else if(date1[0]>date2[0]){
            answer=0;
        }else{
            //#2 년도가 동일한 경우 월(month)비교
            if(date1[1]<date2[1]){
                answer=1;
            }else if(date1[1]>date2[1]){
                answer=0;
            }else{
                //#3 월까지 동일한 경우 일(day)비교
                if(date1[2]<date2[2]){
                    answer=1;
                }else if(date1[2]>date2[2]){
                    answer=0;
                }
            }
        }
        
        
        
           
        

        return answer;
    }
}
