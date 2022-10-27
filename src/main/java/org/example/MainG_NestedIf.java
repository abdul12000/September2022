package org.example;

public class MainG_NestedIf {
    public static void main(String[] args) {
        int dayOfTheWeek=10;
        if(dayOfTheWeek ==1){
            System.out.println("Sunday");
        } else if(dayOfTheWeek ==2){
            System.out.println("Monday");
        } else if(dayOfTheWeek ==3){
            System.out.println("Tuesday");
        } else if(dayOfTheWeek ==4){
            System.out.println("Wednesday");
        } else if(dayOfTheWeek ==5){
            System.out.println("Thursday");
        }else if(dayOfTheWeek ==6){
            System.out.println("Friday");
        }else if(dayOfTheWeek ==7){
            System.out.println("Saturday");
        }  else
        {
            System.out.println("Please enter value between 1 and 7 only");
        }

    }
}
