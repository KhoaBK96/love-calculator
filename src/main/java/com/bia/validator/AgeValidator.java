package com.bia.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int upper;
	private int lower;

	@Override
	public void initialize(Age age) {
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		if (age == null) {
			return false;
		}
		if (age < lower || age > upper) {
			return false;
		}

		return true;
	}

}
