package com.bridgelabz.empwage;
//Uc10
public class CompanyEmpWage {
	public String company;
	public int empRatePerHour;
	public int numOfDays;
	public int maxHrsPerMonth;
	public int totalEmpWage;
	public CompanyEmpWage(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfDays=numOfDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is :"+totalEmpWage;
	}
}
