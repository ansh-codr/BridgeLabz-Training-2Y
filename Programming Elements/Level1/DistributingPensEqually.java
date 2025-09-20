package Level1;
/*Divide 14 pens among 3 students equally. Find how many pens each student gets and how many remain undistributed.
Hint:
	•	Use Division (/) for quantity per student
	•	Use Modulus (%) for remainder
    Output Should be : 
   The Pen Per Student is ___ and the remaining pen not distributed is ___
 */
public class DistributingPensEqually {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}