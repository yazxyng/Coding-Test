import java.util.*;

class Solution {
    public int solution(int[] topping) {
        
        int answer = 0;
        HashMap<Integer, Integer> map1=new HashMap<>();
        HashMap<Integer, Integer> map2=new HashMap<>();

        for(int i=0; i<topping.length; i++){
            if(!map2.containsKey(topping[i])){
                map2.put(topping[i], 1);
            }
            else{
                map2.put(topping[i], map2.get(topping[i])+1);
            }
        }

        for(int i=1; i<topping.length; i++){
            if(!map1.containsKey(topping[i-1])){
                map1.put(topping[i-1], 1);
            }
            else{
                map1.put(topping[i-1], map1.get(topping[i-1])+1);
            }

            if(map2.get(topping[i-1])==1){
                map2.remove(topping[i-1]);
            }
            else{
                map2.put(topping[i-1], map2.get(topping[i-1])-1);
            }

            if(map1.size()==map2.size()) answer++;
        }

        return answer;
    }
}