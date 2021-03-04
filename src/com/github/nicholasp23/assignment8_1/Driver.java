package com.github.nicholasp23.assignment8_1;

import java.util.*;

public class Driver {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Map<Double, String> studentData = new HashMap<Double, String>();

        System.out.println("Put student names and grades. Type '-1' if you want to exit.");
        for(int i = 0; i < 1000; i++){

                System.out.print("Enter the student's name: ");
                String name = input.next();

                if(name.equalsIgnoreCase("-1")) { break;}

                System.out.print("Enter the student's grade: ");
                Double points = input.nextDouble();

                if(points == -1) { break;}

                studentData.put(points, name);
                System.out.println("Student " + (i+1) + " is saved.\n");
            }

            System.out.println("");

            for(Map.Entry<Double, String> key: studentData.entrySet()){
                System.out.println(key.getValue() + " got a " + key.getKey() + "% on the test.");
            }

        }

    }

