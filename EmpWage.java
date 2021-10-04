package com.bridgelabz.empwage;
//Uc11
public class EmpWage {
	public String company;
	public int empRatePerHour;
	public int numOfDays;
	public int maxHrsPerMonth;
	public int totalEmpWage;
	public EmpWage(String company,int empRatePerHour,int numOfDays,int maxHrsPerMonth) {
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
