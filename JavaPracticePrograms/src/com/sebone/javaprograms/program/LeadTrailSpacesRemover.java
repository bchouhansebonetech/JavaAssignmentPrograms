package com.sebone.javaprograms.program;

public class LeadTrailSpacesRemover {
	public String removeLeadTrailSpacesFromString(String str) {
		String resultStr = "";
		int strLength;
		try {
			strLength = str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return null;
		}
		
		int left = -1;
		int right = -2;
		
		for(int iterator = 0; iterator < strLength; iterator++) {
			if(str.charAt(iterator) != ' ') {
				left = iterator;
				break;
			}
		}
		
		for(int iterator = strLength - 1; iterator >= 0; iterator--) {
			if(str.charAt(iterator) != ' ') {
				right = iterator;
				break;
			}
		}
		
		for(int iterator = left; iterator <= right; iterator++) {
			resultStr += str.charAt(iterator);
		}
		
		return resultStr;
		
	}
}
