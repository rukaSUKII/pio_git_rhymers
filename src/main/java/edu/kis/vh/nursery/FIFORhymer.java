package edu.kis.vh.nursery;

public class FIFORhymer extends DefafultRhymer {

	public DefafultRhymer temp = new DefafultRhymer();

	
	@Override
	public int decreaseCount() {
		while (!callCheck())
			
		temp.increaseCount(super.decreaseCount());
		
		int ret = temp.decreaseCount();
		
		while (!temp.callCheck())
			
		increaseCount(temp.decreaseCount());
		
		return ret;
	}
}

//Alt+-> przesuwa na następny otwarty plik