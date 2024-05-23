class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int number = left; number <= right; number++){
            int cnt = 0;
            for(int i=1; i <= number; i++) {
                if(i * i == number) {cnt++;}
                else if(number % i == 0) {cnt+=2;}
            }
            if(cnt % 2 == 0){answer += number;}
            else {answer -= number;}
        }      
        return answer;
    }
}