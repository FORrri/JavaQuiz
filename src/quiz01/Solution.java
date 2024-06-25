package quiz01;



import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack <Integer> steak = new Stack<Integer>();
        int i=0;
        int empty [] = {-1};
        while(i<arr.length) {
        	if(steak.isEmpty()) {
        		steak.push(arr[i]);
        		i++;
        	}else if(steak.peek()==arr[i]) {
        		steak.pop();
        		i++;
        	}else if(steak.peek()!=arr[i]) {	
        		steak.push(arr[i]);
        		i++;
        	}
        	
        }
        
        if(steak.isEmpty()) {
        	return empty;
        }
        
        
        
        return steak.stream().mapToInt(Integer::intValue).toArray();
    }
}
            
            
        
  


//문제 설명
//문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을
//return 하는 solution 함수를 완성해 주세요.