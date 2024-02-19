package com.switch21;

//https://docs.oracle.com/en/java/javase/21/language/switch-expressions.html#GUID-BA4F63E3-4823-43C6-A5F3-BAA4A2EF3ADC
public class SwitchExpressions {
    public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

    public static void main(String[] args) {
        System.out.println(isWeekend(Day.MONDAY));

        System.out.println(isWeekendWithYield(Day.SUNDAY));

        isWeekendVoidSwitchWithoutYieldAndNoReturn(Day.SUNDAY);



    }

    private static boolean isWeekend(Day day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> true;
            default -> false;
        };
    }

    private static boolean isWeekendWithYield(Day day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> {
                System.out.println("I could do something more in switch expression apart from returning value using yield");
                yield true; }
            default -> false;
        };
    }

    private static void isWeekendVoidSwitchWithoutYieldAndNoReturn(Day day) {
        boolean weekend;
         switch (day) {
            case SATURDAY, SUNDAY -> {
                weekend = true;
                }
            default -> weekend = false;
        };
         System.out.println(weekend);
    }

    static void testSwitchStatementExhaustive(Object obj) {
        switch (obj) {
            case String s ->
                System.out.println(s);
            case Integer i ->
                System.out.println("Integer");
            default ->
                    System.out.println("Some other");

        }
    }


}