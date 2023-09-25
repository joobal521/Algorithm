class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer=new int[2];
        int max=array[0];
        int x=-1;
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
                x=i;
                
            }
        }
        
        answer[0]=max;
        answer[1]=x;
        return answer;
    }
}