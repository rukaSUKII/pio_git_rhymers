package edu.kis.vh.nursery;

public class FIFORhymer extends DefafultRhymer {

	public DefafultRhymer temp = new DefafultRhymer();

	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}

//Alt+-> przesuwa na następny otwarty plik