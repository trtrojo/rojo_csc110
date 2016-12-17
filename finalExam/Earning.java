/*
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Csc110, Final Exam Fall 2016
 * Question 5: Write a class and java program to use said class
 * 
 */

public class Earning {
 double earningYTD;
 double hourlyRate;

 public Earning(double earningYTD, double hourlyRate) {
  this.earningYTD = earningYTD;
  this.hourlyRate = hourlyRate;
 }

 public void setEarningYTD(double earningYTD) {
  this.earningYTD = earningYTD;
 }
 
 public double getEarningYTD() {
  return earningYTD;
 }

 public double calculateEarning(double workingHours) {
  return hourlyRate * workingHours;
 }
}

