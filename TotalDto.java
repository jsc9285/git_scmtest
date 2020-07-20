package com.test.dto;

public class TotalDto {

	private int fisrtSum = 0;
	private int secondSum = 0;
	private int firstMaxNum = 0;
	private int secondMaxNum = 0;
	
	public TotalDto() {
		super();
	}

	public TotalDto(int fisrtSum, int secondSum, int firstMaxNum, int secondMaxNum) {
		super();
		this.fisrtSum = fisrtSum;
		this.secondSum = secondSum;
		this.firstMaxNum = firstMaxNum;
		this.secondMaxNum = secondMaxNum;
	}

	public int getFisrtSum() {
		return fisrtSum;
	}

	public int setFisrtSum(int firstMaxNum) {
		
		for (int i = 1; i <= firstMaxNum; i++) {
			fisrtSum += i;
		}
		
		return fisrtSum;
	}

	public int getSecondSum() {
		return secondSum;
	}

	public int setSecondSum(int secondMaxNum) {
		
		for (int i = 1; i <= secondMaxNum; i++) {
			secondSum += i;
		}
		
		return secondSum;
		
	}

	public int getFirstMaxNum() {
		return firstMaxNum;
	}

	public int setFirstMaxNum(int firstMaxNum) {
		
		return this.firstMaxNum = firstMaxNum;
	}

	public int getSecondMaxNum() {
		return secondMaxNum;
	}

	public int setSecondMaxNum(int secondMaxNum) {
		
		return this.secondMaxNum = secondMaxNum;
	}

}
