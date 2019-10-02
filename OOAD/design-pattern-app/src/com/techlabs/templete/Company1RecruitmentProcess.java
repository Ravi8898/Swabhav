package com.techlabs.templete;

public class Company1RecruitmentProcess extends RecruitmentProcessTemplete {

	@Override
	public boolean isGraduate() {
		return true;
	}

	@Override
	public void hrRound() {

		System.out.println("Hii...It's your HR Round...");
	}

}
