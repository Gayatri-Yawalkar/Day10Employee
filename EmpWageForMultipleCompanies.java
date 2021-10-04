package com.bridgelabz.empwage;
//Uc9
public class EmpWageForMultipleCompanies {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private static String company;
	private static int empRatePerHour;
	private static int numOfDays;
	private static int maxHrsPerMonth;
	public EmpWageForMultipleCompanies(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfDays=numOfDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}
	public int calcEmpWageForCompany() {
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHrsPerMonth && totalWorkingDays<numOfDays) {
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
		int totalEmpWage=totalEmpHrs*empRatePerHour;
		return totalEmpWage;		
	}
	public static void main(String[] args) {
		EmpWageForMultipleCompanies dmart=new EmpWageForMultipleCompanies("DMart",20,20,100);
		int dmartTotalEmpWage=dmart.calcEmpWageForCompany();
		System.out.println("Total Employee Wage for "+company+" = "+dmartTotalEmpWage);
		EmpWageForMultipleCompanies dell=new EmpWageForMultipleCompanies("Dell",30,25,100);
		int dellTotalEmpWage=dell.calcEmpWageForCompany();
		System.out.println("Total Employee Wage for "+company+" = "+dellTotalEmpWage);
		
	}

}
