package edu.kis.vh.nursery;


public class DefafultRhymer {


	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void increaseCount(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
			return total == -1;
		}

	public boolean isFull() {
		return total == 11;
	}

	protected int checkRhymers() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}

	public int decreaseCount() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}
}
