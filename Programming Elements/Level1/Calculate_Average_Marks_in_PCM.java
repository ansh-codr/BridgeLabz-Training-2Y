package Level1;
/*Problem:
Sam scored 94 in Maths, 95 in Physics, and 96 in Chemistry (out of 100). Find the average percentage of PCM.
	•	Input: None
	•	Output: Sam’s average mark in PCM is _
     */
public class Calculate_Average_Marks_in_PCM {
    public static void main(String[] args){
        int maths = 94;
        int physics =95;
        int chemistry = 96;
        int total_marks = maths + physics + chemistry;
        int avg_marks = total_marks / 3;
        System.out.println("Sam's Average marks in PCM is " + avg_marks);
    }
}
