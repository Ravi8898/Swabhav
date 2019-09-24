package com.techlabs.templete;

public class Company2RecruitmentProcess extends RecruitmentProcessTemplete {

	@Override
	public boolean isGraduate() {
		return false;
	}

	@Override
	public void hrRound() {
		System.out.println("Hello and Congratulation you had cleared the Aptitute and Technical round...It's your HR Round...");

	}

}
