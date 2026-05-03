package com.exemple;
public class GradeCalculator {

    public static String getGrade(int score) {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                "Score invalide : " + score + ". Doit être entre 0 et 100."
            );
        }

        if (score > 90) return "A";
        if (score > 75) return "B";
        if (score > 60) return "C";
        if (score > 49) return "D";
        return "F";
    }
}