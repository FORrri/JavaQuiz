package quiz01;

public class Quiz24 {

	public static void main(String[] args) {
		// 배열이 주어질 때 배열 요소 중 가장 큰 값 하나만 출력.  
		int [] arr = {34,65,12,34,56,100,54,21,99};
		int max = arr[0]; //가장 큰 값
		
		for(int a : arr) {
			if(max<a) {
				max=a;
			}
		}System.out.println(max);
	}
}
		

//		for(int i = 0 ; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max=arr[i];
//			}
//			
//		}System.out.println(max);
//	}
//}
//}

		
		
			
			
////			System.out.print(arr[i]);
//			for(int j = arr.length-1; j>=0; j--) {
//				if(arr[i]>arr[j]) {
//					
//				}
//					
//				
//			}
//			
	
//			if(arr[i]>arr[i]) {
//				System.out.println(i);
//			}
//			
				
//for(int a : arr) {
//				
//			}
//			if(arr[i]>) {
//				
//			}
//		}
//		
//
//	}
//

