package com.pk.quickstart;

public class Student {
    private String name;
    private double chineseScore;
    private double mathScore;

    public Student() {
    }

    public Student(String name, double chineseScore, double mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public void printTotalScore() {
        System.out.println(name + "同学的总成绩为:" + (chineseScore + mathScore));
    }
    public void printAverageScore() {
        System.out.println(name + "同学的平均成绩为:" + (chineseScore + mathScore)/2.0);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return chineseScore
     */
    public double getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     * @param chineseScore
     */
    public void setChineseScore(double chineseScore) {
        if (chineseScore >= 0 && chineseScore <= 150) {
            this.chineseScore = chineseScore;
        } else {
            System.out.println("error data");
        }
    }

    /**
     * 获取
     * @return mathScore
     */
    public double getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     * @param mathScore
     */
    public void setMathScore(double mathScore) {
        if (mathScore >= 0 && mathScore <= 150) {
            this.mathScore = mathScore;
        } else {
            System.out.println("error data");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", chineseScore = " + chineseScore + ", mathScore = " + mathScore + "}";
    }
}
