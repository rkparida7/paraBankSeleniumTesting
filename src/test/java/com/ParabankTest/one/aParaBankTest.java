package com.ParabankTest.one;

import java.io.IOException;
import org.testng.annotations.Test;

public class aParaBankTest extends webActions {

	aParaBankTestFunctions steps = new aParaBankTestFunctions();

	@Test(groups = { "paraBankTest" })
	public void Testing() throws InterruptedException, IOException {

		steps.urlLuncing();
		steps.signUp();
		steps.login();
		steps.accountCreation();
		steps.FundTransfer();
		steps.entriesFundTransfer();
		steps.logOut();
	}
}
