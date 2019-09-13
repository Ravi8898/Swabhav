package com.techlabs.unittest;

public class Foo {

	@UnitTest
	public boolean m1() {
		return false;

	}

	public boolean m2() {
		return true;

	}

	@UnitTest
	public boolean m3() {
		return true;

	}

	@UnitTest
	public boolean m4() {
		return false;

	}
}