package edu.kis.vh.nursery;

<<<<<<< HEAD
=======
>>>>>>> 8133106 (3.1 Changed names of the classes)
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static void main(String[] args) {
		Rhymersfactory factory = new RhymersInitialization();
		
<<<<<<< HEAD
		DefaultRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
=======
		DefafultRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
>>>>>>> 8133106 (3.1 Changed names of the classes)
				factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].increaseCount(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].increaseCount(rn.nextInt(20));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].decreaseCount() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
		
	}
	
}