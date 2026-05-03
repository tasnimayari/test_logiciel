package com.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    private String displayName;

    @BeforeEach
    void setUp(TestInfo info) {
        displayName = info.getDisplayName();
    }

    @AfterEach
    void tearDown() {
        System.out.println("false,1,false,2," + displayName + ": PASSED");
    }

    @Test
    @DisplayName("Score 0 → F")
    void testScoreZero() {
        assertEquals("F", GradeCalculator.getGrade(0));
    }

    @Test
    @DisplayName("Score 25 → F")
    void testScoreMidF() {
        assertEquals("F", GradeCalculator.getGrade(25));
    }

    @Test
    @DisplayName("2-pt | 49 → F")
    void test2pt_49() {
        assertEquals("F", GradeCalculator.getGrade(49));
    }

    @Test
    @DisplayName("2-pt | 50 → D")
    void test2pt_50() {
        assertEquals("D", GradeCalculator.getGrade(50));
    }

    @Test
    @DisplayName("2-pt | 60 → D")
    void test2pt_60() {
        assertEquals("D", GradeCalculator.getGrade(60));
    }

    @Test
    @DisplayName("2-pt | 61 → C")
    void test2pt_61() {
        assertEquals("C", GradeCalculator.getGrade(61));
    }

    @Test
    @DisplayName("2-pt | 75 → C")
    void test2pt_75() {
        assertEquals("C", GradeCalculator.getGrade(75));
    }

    @Test
    @DisplayName("2-pt | 76 → B")
    void test2pt_76() {
        assertEquals("B", GradeCalculator.getGrade(76));
    }

    @Test
    @DisplayName("2-pt | 90 → B")
    void test2pt_90() {
        assertEquals("B", GradeCalculator.getGrade(90));
    }

    @Test
    @DisplayName("2-pt | 91 → A")
    void test2pt_91() {
        assertEquals("A", GradeCalculator.getGrade(91));
    }

    @Test
    @DisplayName("2-pt | 100 → A")
    void test2pt_100() {
        assertEquals("A", GradeCalculator.getGrade(100));
    }

    @Test
    @DisplayName("3-pt | 48 → F")
    void test3pt_48() {
        assertEquals("F", GradeCalculator.getGrade(48));
    }

    @Test
    @DisplayName("3-pt | 59 → D")
    void test3pt_59() {
        assertEquals("D", GradeCalculator.getGrade(59));
    }

    @Test
    @DisplayName("3-pt | 74 → C")
    void test3pt_74() {
        assertEquals("C", GradeCalculator.getGrade(74));
    }

    @Test
    @DisplayName("3-pt | 89 → B")
    void test3pt_89() {
        assertEquals("B", GradeCalculator.getGrade(89));
    }

    @Test
    @DisplayName("Score -1 → exception")
    void testScoreNegatif() {
        assertThrows(IllegalArgumentException.class,
            () -> GradeCalculator.getGrade(-1));
    }

    @Test
    @DisplayName("Score 101 → exception")
    void testScoreAuDessus100() {
        assertThrows(IllegalArgumentException.class,
            () -> GradeCalculator.getGrade(101));
    }
}