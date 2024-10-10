package edu.week3_task1_a;

public class AgeAnalyse {

    public static String getAgeDeclension(int userAge) {
        int ageLastDigit = userAge % 10;
        if (ageLastDigit == 0 || (ageLastDigit >= 5 && ageLastDigit < 9) || (userAge >=11 && userAge <=14) ){
           return userAge + " лет";
        }
        else if (ageLastDigit == 1){
            return userAge + " год";
        }
        else{
            return userAge + " года";
        }
    }
}