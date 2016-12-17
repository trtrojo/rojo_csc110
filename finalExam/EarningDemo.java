/*
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Csc110, Final Exam Fall 2016
 * Question 5: Write a class and java program to use said class
 * 
 */

public class EarningDemo {
 public static void main(String[] args) {
  double earnedAmount;
  double earnedAmountYTD;

  Earning Jane = new Earning(2500,25.78);
  earnedAmount = Jane.calculateEarning(200); //200 hours
  //System.out.println("Jane's earnedAmount is " + earnedAmount);
  earnedAmountYTD = earnedAmount + Jane.getEarningYTD();
  //System.out.println("Janes earnedAmountYTD is " + earnedAmountYTD);
  Jane.setEarningYTD(earnedAmountYTD);
 //System.out.println("Jane's new EarningYTD is " + Jane.getEarningYTD());

//we are done with jane...now starting on bill

  Earning Bill = new Earning(10000,34.26);

  earnedAmount = Bill.calculateEarning(120); //120 hours
  //System.out.println("Bill's earnedAmount is " + earnedAmount);

  earnedAmountYTD = earnedAmount + Bill.getEarningYTD();
  //System.out.println("Bill's earnedAmountYTD is " + earnedAmountYTD);

  Bill.setEarningYTD(earnedAmountYTD);
  //System.out.println("Bill's new EarningYTD is " + Bill.getEarningYTD());

  if (Jane.getEarningYTD() > Bill.getEarningYTD()) {
   System.out.println("Jane earned more than bill with " + Jane.getEarningYTD());
  } else if (Jane.getEarningYTD() < Bill.getEarningYTD()) {
     System.out.println("Bill earned more than Jane with " + Bill.getEarningYTD());
  }
 }
}
