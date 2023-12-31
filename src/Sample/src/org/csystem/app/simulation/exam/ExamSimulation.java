package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public int [][] grades;
    public double [] averages;
    public int [] maxGrades;
    public int [] minGrades;
    public double average;
    public int maxGrade;
    public int minGrade;

    public int calculateAndGetSumGrades(int i)
    {
        maxGrades[i] = grades[i][0];
        minGrades[i] = grades[i][0];
        int sumGrades = 0;

        for (int k = 0; k < grades[i].length; ++k) {
            maxGrades[i] = Math.max(maxGrades[i], grades[i][k]);
            minGrades[i] = Math.min(minGrades[i], grades[i][k]);
            maxGrade = Math.max(maxGrades[i], maxGrade);
            minGrade = Math.min(minGrades[i], minGrade);
            sumGrades += grades[i][k];
        }

        return sumGrades;
    }

    public void fillGrades()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Şube sayısını giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        grades = new int[n][];
        averages = new double[n];
        maxGrades = new int[n];
        minGrades = new int[n];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şube öğrenci sayısını giriniz:", i + 1);
            grades[i] = ArrayUtil.generateRandomArray(r, Integer.parseInt(kb.nextLine()), 0, 101);
        }
    }

    public void doSimulation()
    {
        int totalGrades = 0;
        int nStudents = 0;
        maxGrade = 0;
        minGrade = 100;

        for (int i = 0; i < grades.length; ++i) {
            nStudents += grades[i].length;
            int sumGrades = calculateAndGetSumGrades(i);

            averages[i] = (double) sumGrades / grades[i].length;
            totalGrades += sumGrades;
        }

        average = (double) totalGrades / nStudents;
    }

    public ExamSimulation(String name)
    {
        lectureName = name;
    }

    public void run()
    {
        fillGrades();
        doSimulation();
    }

    public void printReport()
    {
        System.out.println("#################################################################");
        printGrades();
        for (int i = 0; i < averages.length; ++i)
            System.out.printf("%d.şube:Ortalama:%f, En yüksek not:%d, En düşük not:%d%n", i + 1, averages[i],
                    maxGrades[i], minGrades[i]);
        System.out.printf("Okul Ortalaması:%f%n", average);
        System.out.printf("En yüksek not:%d%n", maxGrade);
        System.out.printf("En düşük not:%d%n", minGrade);
        System.out.println("#################################################################");
    }

    public void printGrades()
    {
        System.out.println("-----------------------------------------------------------------");

        System.out.printf("%s dersi notları:%n", lectureName);
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d.şube:", i + 1);
            ArrayUtil.print(grades[i]);
        }

        System.out.println("-----------------------------------------------------------------");
    }
}
