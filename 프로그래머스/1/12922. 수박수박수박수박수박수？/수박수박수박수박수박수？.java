import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(int n) {
        String answer = "";
        List<Character> charList  = new ArrayList<>();
        for(int i = 0; i < n; i++ ){
            if(i % 2 == 0){
                charList.add('수');
            } else {
                charList.add('박');
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Character ch : charList) {
            sb.append(ch);
        }

        answer = sb.toString();
        return answer;
    }
}