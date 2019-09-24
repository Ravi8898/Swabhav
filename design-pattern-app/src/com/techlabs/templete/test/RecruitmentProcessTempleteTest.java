package com.techlabs.templete.test;

import com.techlabs.templete.Company1RecruitmentProcess;
import com.techlabs.templete.Company2RecruitmentProcess;
import com.techlabs.templete.RecruitmentProcessTemplete;

public class RecruitmentProcessTempleteTest {

	public static void main(String[] args) {
		
		RecruitmentProcessTemplete recruimentProcess=new Company1RecruitmentProcess();
		recruimentProcess.takeRecruiment(true);
		recruimentProcess.takeRecruiment(false);
		System.out.println();
		
		recruimentProcess=new Company2RecruitmentProcess();
		recruimentProcess.takeRecruiment(true);
		recruimentProcess.takeRecruiment(false);
	}
}
