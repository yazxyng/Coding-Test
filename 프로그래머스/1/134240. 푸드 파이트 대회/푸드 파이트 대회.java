class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer+=i;
            }
        }
        String temp=answer;
        answer+=0;
        for(int i=0; i<temp.length(); i++){
            answer+=temp.charAt(temp.length()-i-1);
        }
        return answer;
    }
}