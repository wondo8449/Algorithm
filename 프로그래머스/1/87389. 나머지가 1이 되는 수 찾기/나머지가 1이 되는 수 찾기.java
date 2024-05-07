class Solution {
    public int solution(int numbers) {
        int answer = 0;
        
        for (int i =numbers; i > 0; i--){
            if(numbers % i == 1){
                answer = i;
            }
        }
        
        return answer;
    }
}