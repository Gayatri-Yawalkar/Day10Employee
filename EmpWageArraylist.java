package com.bridgelabz.empwage;
//Uc12
import java.util.ArrayList;
public class EmpWageArraylist {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	ArrayList<CompanyEmpWage> companyArrayList; 
	public EmpWageArraylist() {
		companyArrayList=new ArrayList<>();
	}
	public void addCompany(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfDays,maxHrsPerMonth);
		companyArrayList.add(companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i=0;i<companyArrayList.size();i++) {
			CompanyEmpWage companyEmpWage=companyArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
			System.out.println(companyEmpWage);
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
		EmpWageArraylist empWageArrayList=new EmpWageArraylist();
		empWageArrayList.addCompany("HP",20,20,100);
		empWageArrayList.addCompany("DMart",30,25,100);
		empWageArrayList.computeEmpWage();
	}
}
