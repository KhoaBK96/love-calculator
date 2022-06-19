package com.bia.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = " * Your Name can't be blank")
	@Size(min = 3 , max = 15 , message = "* Your Name should have char between 3-15")
	public String userName;
	public String crushName;
	
	@AssertTrue(message = "You have to agree")
	private boolean termAndCondition;
	
	public UserInfoDTO() {
		System.out.println("user info dto constructor call");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	
	
	
}
