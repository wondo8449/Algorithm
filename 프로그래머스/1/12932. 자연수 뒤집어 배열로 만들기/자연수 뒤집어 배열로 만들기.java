import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> a = new ArrayList<Integer>((int)(Math.log10(n)+1));
        String num = Long.toString(n);

        for(int i=num.length(); i >= 1; i--){
            a.add(Character.getNumericValue(num.charAt(i-1)));
        }

        int[] arr = new int[a.size()];
        for(int j=0; j<a.size(); j++){
            arr[j] = a.get(j);
        }

        return arr;
    }
}