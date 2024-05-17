class Solution {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int j = 0;
        for(int i : absolutes) {
            if (signs[j] == true) {
                answer += i;
                j++;
                System.out.println(answer);
            } else if (signs[j] == false){
                answer -= i;
                j++;
                System.out.println(answer);
            }
        }
        return answer;
    }
}