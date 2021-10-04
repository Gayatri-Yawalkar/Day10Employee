package com.bridgelabz.empwage;
//Uc8
public class ComputeEmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static void main(String[] args) {
		int totalEmpWage=calcEmpWageForCompany("DMart",20,20,100);
		System.out.println("Total Employee Wage for DMart="+totalEmpWage);
		int totalEmpWageMicro=calcEmpWageForCompany("Microsoft",30,25,100);
		System.out.println("Total Employee Wage for Microsoft="+totalEmpWageMicro);
	}
	public static int calcEmpWageForCompany(String company,int empRate,int numOfDays,int maxHrs) {
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHrs && totalWorkingDays<numOfDays) {
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
					break;
			}
			totalEmpHrs+=empHrs;
			totalWorkingDays+=1;		
		}
		int totalEmpWage=totalEmpHrs*empRate;
		return totalEmpWage;		
	}
}
