package pkg;

import java.util.Arrays;
import java.util.Collections;

public class Quiz2 {

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 2, 14, 0};	//주어진 값
		Integer[] arrObj = new Integer[arr.length];	//새 배열 만드는 문장 자료형이 Integer
		for (int i = 0; i < arrObj.length; i++) {	//for 반복문으로 arrObj의 값을 복사하려고 함 arr의 값으로
		 arrObj[i] = arr[i];
		}
				
				
		//코드 작성
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		Arrays.sort(arrObj,Collections.reverseOrder());	//
		System.out.println(Arrays.toString(arrObj));
		
		
	}

}
