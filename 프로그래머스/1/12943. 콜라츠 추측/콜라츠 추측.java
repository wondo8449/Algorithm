class Solution {
    public int solution(int num) {
        int answer = 0;
        for(int i = 1; i < 400; i++){
            if(num % 2 == 0){
                num = num / 2;
            } else if (num == 1) {
                break;
            } else {
                num = num * 3 + 1;
            }
            answer = i;
        }
        if(num != 1){
            answer = -1;
        }
        return answer;
    }
}