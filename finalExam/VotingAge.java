/*
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * Csc110, Final Exam Fall 2016
 * Question 4: Fix the errrors in a code segment to make it a valid java program.
 * 
 */

public class VotingAge {
 public static void main(String[] args) {
  double myAge = 15;
  String ableToVote = "Yes";

  final int VOTING_AGE = 18;

  if (myAge < VOTING_AGE) {
   ableToVote = "No";
  }

  System.out.println("My Age: " + myAge);
  System.out.println("Able to vote: " + ableToVote);
 }
}
