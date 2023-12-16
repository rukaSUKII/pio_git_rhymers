package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefafultRhymer;

	public interface Rhymersfactory {
	
		public DefafultRhymer GetStandardRhymer();
		
		public DefafultRhymer GetFalseRhymer();
		
		public DefafultRhymer GetFIFORhymer();
		
		public DefafultRhymer GetHanoiRhymer();

		
	}
