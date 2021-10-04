package com.bridgelabz.empwage;
//Uc10
public class EmpWageWithArray {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private int numOfCompany=0;
	private CompanyEmpWage[] companyArray;
	public EmpWageWithArray() {
		companyArray=new CompanyEmpWage[5];
	}
	public void addCompany(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
		companyArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfDays,maxHrsPerMonth);
		numOfCompany++;
	}
	public void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			int totalEmpWage=this.computeWage(companyArray[i]);
			System.out.println("Total Emp Wage for "+this.companyArray[i].company+ " is "+totalEmpWage);
		}
	}
	private int computeWage(CompanyEmpWage company) {
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
		EmpWageWithArray empWageArray=new EmpWageWithArray();
		empWageArray.addCompany("HP",20,20,100);
		empWageArray.addCompany("DMart",30,25,100);
		empWageArray.computeEmpWage();
	}
}