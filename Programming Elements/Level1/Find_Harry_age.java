package Level1;
/*
Problem:
Find the age of Harry if the birth year is 2000. Assume the current year is 2024.
	•	Input: None
	•	Output: Harry's age in 2024 is ___
*/
public class Find_Harry_age {
    public static void main(String[] args){
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        
        System.out.println("Harry's age in 2024 is " + age);
    }
}
