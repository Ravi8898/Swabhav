package com.techlabs.templete;

public abstract class RecruitmentProcessTemplete {

	public abstract boolean isGraduate();

	public final void takeRecruiment(boolean isGraduate) {
		if (isGraduate) {
			aptitudeRound();
			technicalRound();
			hrRound();
		}
		else
			System.out.println("Sorry...you are not graduated...\n Please try after completion of your Graduation.");

	}

	private final void aptitudeRound() {
		System.out.println("Two hours for 200 questions");
	}

	private final void technicalRound() {
		System.out.println("Two hours to write 3 codes");
	}

	public abstract void hrRound();
}
