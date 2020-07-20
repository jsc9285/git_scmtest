package com.test.main;

import java.util.Scanner;

import com.test.dto.TotalDto;

public class TotalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TotalDto totalDto = new TotalDto();
		
		int fisrtSum = 0;
		int secondSum = 0;
		
		int firstMaxNum = 0;
		int secondMaxNum = 0;
		
		Scanner firstScan = new Scanner(System.in);
		Scanner secondScan = new Scanner(System.in);
		
		System.out.println("최대값 입력");
		firstMaxNum = totalDto.setFirstMaxNum(firstScan.nextInt());
		secondMaxNum = totalDto.setSecondMaxNum(secondScan.nextInt());
		fisrtSum = totalDto.setFisrtSum(firstMaxNum);
		secondSum = totalDto.setSecondSum(secondMaxNum);
		
		System.out.println("1 부터 " + secondMaxNum + " 까지의 합은 " + secondSum);
		
	}

}
