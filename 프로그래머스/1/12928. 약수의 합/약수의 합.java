class Solution {
    public int solution(int numbers) {
        int answer = 0;
        
        for (int i =1; i <= numbers; i++) {
            if(numbers % i == 0) {
                answer += numbers / i;
            }
        }
        return answer;
    }
}