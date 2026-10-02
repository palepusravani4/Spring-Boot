package com.task.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.task.comps.Student;
import com.task.config.AppConfig;
import com.task.service.PlacementService;


public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PlacementService service = ctx.getBean("placement",PlacementService.class);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        Student stu = new Student(name, cgpa);

        System.out.println("\n--- Placement Recommendation ---");
        System.out.println(service.getPlacementRecommendation(stu));

        ctx.close();
        sc.close();
    }
}

