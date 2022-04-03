package com.sebone.javaprograms.program;

public class SpacesRemoverFromString {
	public String removingSpacesFromString(String str) {
		int strLength;
		String resultStr = "";
		try {
			strLength = str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return null;
		}
		
		for(int iterator = 0; iterator < strLength; iterator++) {
			if(str.charAt(iterator) != ' ') {
				resultStr = resultStr + str.charAt(iterator);
			}
		}
		return resultStr;
	}
}
