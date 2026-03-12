package com.codealpha.studenttracker;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            students.add(new Student(name, grade));
        }

        int sum = 0;
        int highest = students.get(0).getGrade();
        int lowest = students.get(0).getGrade();

        System.out.println("\n----- Student Report -----");

        for (Student s : students) {

            System.out.println(s.getName() + " : " + s.getGrade());

            int grade = s.getGrade();
            sum += grade;

            if (grade > highest)
                highest = grade;

            if (grade < lowest)
                lowest = grade;
        }

        double average = (double) sum / students.size();

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }
}
