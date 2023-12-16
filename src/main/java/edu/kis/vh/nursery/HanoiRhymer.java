package edu.kis.vh.nursery;


public class HanoiRhymer extends DefafultRhymer {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void increaseCount(int in) {
	if (!callCheck() && in > checkRhymers())
			totalRejected++;
			else
				super.increaseCount(in);
	}
}
