package com.sebone.javaprograms.program;

public class VowelCheckingInString {
	public boolean isVowelAvailable(String str) {
		int strLength;
		try {
			strLength = str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return false;
		}
		
		for(int iterator = 0; iterator < strLength; iterator++) {
			if(str.charAt(iterator) == 'a' || str.charAt(iterator) == 'e' || str.charAt(iterator) == 'i' || str.charAt(iterator) == 'o' ||str.charAt(iterator) == 'u') {
				return true;
			}
		}
		return false;
	}
	
	public int countVowelsInString(String str) {
		int strLength;
		int count = 0;
		try {
			strLength = str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return 0;
		}
		
		for(int iterator = 0; iterator < strLength; iterator++) {
			if(str.charAt(iterator) == 'a' || str.charAt(iterator) == 'e' || str.charAt(iterator) == 'i' || str.charAt(iterator) == 'o' ||str.charAt(iterator) == 'u') {
				count++;
			}
		}
		return count;
	}
}
