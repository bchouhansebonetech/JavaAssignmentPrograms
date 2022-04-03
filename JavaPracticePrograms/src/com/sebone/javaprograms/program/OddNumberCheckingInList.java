package com.sebone.javaprograms.program;

import java.util.ArrayList;

public class OddNumberCheckingInList {
	public boolean isOnlyOddAvailable(ArrayList<Integer> numberList) {
		int listLength;
		
		try {
			listLength = numberList.size();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return false;
		}
		
		for(int iterator = 0; iterator < listLength; iterator++) {
			if(numberList.get(iterator) % 2 == 0)
				return false;
		}
		
		if(listLength == 0)
			return false;
		
		return true;
	}
}
