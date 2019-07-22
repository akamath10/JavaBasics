package com.example.enumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Enumset {

    private enum WeekDay {
         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args) {
        // Creating EnumSet using range
        EnumSet<WeekDay> weekDaySet = EnumSet.range(
                    WeekDay.MONDAY, WeekDay.FRIDAY);
        // Creating EnumSet using complementOf method, The created 
        // set will contain all elements of the Enum not
        // contained in the specified set
        EnumSet<WeekDay> weekEndSet = EnumSet.complementOf(weekDaySet);
        
        //Another way of Creating EnumSet using of Method
        /*EnumSet<WeekDay> weekEndSet = EnumSet.of(
                    WeekDay.SATURDAY, WeekDay.SUNDAY);*/
        System.out.println("Using for each");
        // Iterating EnumSet
        for(WeekDay day : weekDaySet){
            System.out.println("Day - " + day);
        }
        
        System.out.println("Using itertor");
        Iterator<WeekDay> itr = weekEndSet.iterator();
        while(itr.hasNext()){
            System.out.println("Day - " + itr.next());
        }
        
        System.out.println("Need to work ? " + 
                    isWorkingDay(weekDaySet, WeekDay.MONDAY));
        System.out.println("Need to work ? " + 
                isWorkingDay(weekDaySet, WeekDay.SATURDAY));
    }
    private static boolean isWorkingDay(Set<WeekDay> daysSet, WeekDay day){    
        return daysSet.contains(day);
        
    }

}
