package com.enigma.isma.kalkulator_mvn.services;

public class KalkulatorServiceImpl implements KalkulatorService{

	public int add(int numb1, int numb2) {
		int result = numb1 + numb2;
		return result;
	}

	public int substract(int numb1, int numb2) {
		int result = numb1 - numb2;
		return result;
	}

	public int multiply(int numb1, int numb2) {
		int result = numb1 * numb2;
		return result;
	}

	public Double divide(Double numb1, Double numb2) {
		Double result = numb1 / numb2;
		return result;
	}

	public int modulus(int numb1, int numb2) {
		int result = numb1 % numb2;
		return result;
	}
	

}
