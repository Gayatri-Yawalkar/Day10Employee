package com.bridgelabz.empwage;
//Uc11
public class EmpWageUsingInterface implements EmpInterface{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private int numOfCompany=0;
	private EmpWage[] companyArray;
	public EmpWageUsingInterface() {
		companyArray=new EmpWage[5];
	}
	public void addCompany(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
		companyArray[numOfCompany]=new EmpWage(company,empRatePerHour,numOfDays,maxHrsPerMonth);
		numOfCompany++;
	}
	public void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			companyArray[i].setTotalEmpWage(this.computeWage(companyArray[i]));
			System.out.println(companyArray[i]);
			//System.out.println("Total Emp Wage for "+this.companyArray[i].company+ " is "+totalEmpWage);
		}
	}
	private int computeWage(EmpWage company) {
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=company.maxHrsPerMonth && totalWorkingDays<company.numOfDays) {
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
		int totalEmpWage=totalEmpHrs*company.empRatePerHour;
		return totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageUsingInterface empWage=new EmpWageUsingInterface();
		empWage.addCompany("HP",20,20,100);
		empWage.addCompany("DMart",30,25,100);
		empWage.computeEmpWage();
	}
}
