package project_utils;

import java.util.Arrays;

public class Utils {

    /** ! IN PROGRESS
     * Assending and dessenging sequince -
     * @params start, end, step
     * @return
     */
    public static int numberSequence(int start, int end, int step) {

        if (step == 0) {
            System.out.println("Error! Enter correct step number");

        } else if (start == end && step != end) {

//            return error;
            System.out.println("Error! Start and end number equals, and entered step don't work ");

        } else {
            int newStart = start - start % step;

            if (start <= end && step > 0) {

                if (newStart < start) {
                    newStart += step;
                }
                for (int i = newStart; i <= end; i += step) {

//                    System.out.print(i + " ");
                    return i;
                }

            } else if (start >= end && step > 0) {

                if (newStart > start) {
                    newStart -= step;
                }
                for (int i = newStart; i >= end; i -= step) {

//                    System.out.print(i + " ");
                    return i;
                }
            } else if (start <= end) {

                if (newStart < start) {
                    newStart -= step;

                }
                for (int i = newStart; i <= end; i -= step) {

//                    System.out.print(i + " ");
                    return i;
                }

            } else {
                if (newStart > start) {
                    newStart += step;
                }
                for (int i = newStart; i >= end; i += step) {

//                    System.out.print(i + " ");
                    return i;
                }
            }
        }

        return 0;
    }

    /**
     * Min and Max value
     * @param A - array
     * @return min and max value
     */
    public static int getMax(int[] A)
    {
        int max = Integer.MIN_VALUE;
        for (int i: A) {
            max = Math.max(max, i);
        }

        return max;
    }

    public static int getMin(int[] A)
    {
        int min = Integer.MAX_VALUE;
        for (int i: A) {
            min = Math.min(min, i);
        }

        return min;
    }

    /**
     * count even, odd elements based on their values
     * @param array
     * @return evenCountVal, oddCountVal
     */
    public static int countEvenElementsValues(int[] array) {
        int evenCountVal = 0;
        int l = array.length;
        for (int i = 0; i < l; i++) {
            if (array[i] % 2 == 0) {
                evenCountVal ++;
            }
        }

        return evenCountVal;
    }
    public static int countOddElementsValues(int[] array) {
        int oddCountVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddCountVal += 1;
            }
        }

        return oddCountVal;
    }

    /**
     * count even, odd elements based on their indexes
     * @param array
     * @return evenCount, oddCount
     */
    public static int countEvenElements(int[] array) {
        int evenIndexCount = 0;
        int l = array.length;
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                evenIndexCount ++;
            }
        }

        return evenIndexCount;
    }
    public static int countOddElements(int[] array) {
        int oddIndexCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                oddIndexCount += 1;
            }
        }

        return oddIndexCount;
    }

    /**
     * двумерный(universal) массив случайных чисел (Teymur)
//     * @param indexA
//     * @param indexB
     * @param start
     * @param end
     */

    public static int [][] random2DArray(int indexA, int indexB, int start, int end) {
        int[][] randomArrays = new int[indexA][indexB];
        int range = (end + 1 - start);

        for (int i = 0; i <= indexA - 1; i++) {
            for (int j = 0; j <= indexB - 1; j++) {

                randomArrays[i][i] = (int) (Math.random() * range) + start;
            }
        }
        for( int i = 0; i <= indexA - 1; i++) {

//            return randomArrays[i][];
            System.out.println(Arrays.toString(randomArrays[i]));
        }

        return randomArrays;

    }

    public static int [] doArrayRandom2(int start, int end, int l) {
        int[] arrayRandom = new int[l];
        for (int i = 0; i <= arrayRandom.length - 1; i++) {
            arrayRandom[i] = (int) (Math.random() * ((end - start) + 1) + start);
        }
        return arrayRandom;
//        System.out.println(Arrays.toString(arrayRandom) + "\n");
    }

    /**
     * Switch method returns weekdays number
     * @param day
     * @return
     */
    public static int returnDayOfTheWeekNumber(String day) {
        switch (day) {
            case "Mon": return 1;
            case "Tue": return 2;
            case "Wed": return 3;
            case "Thu": return 4;
            case "Fri": return 5;
            case "Sat": return 6;
            case "Sun": return 7;
        }

        return 0;
    }

    /**
     * Switch method returns weekdays names - String
     * @param dayName
     * @return
     */
    public static String returnDayOfTheWeekName(int dayName) {
        if (dayName > 0 && dayName < 7) {

            switch (dayName) {
                case 1: return "Mon";
                case 2: return "Tue";
                case 3: return "Wed";
                case 4: return "Thu";
                case 5: return "Fri";
                case 6: return "Sat";
                case 7: return "Sun";
            }
        }

        return "Error: wrong number for day";
    }

    /**
     * Switch method returns a month name - String
     * @param monthName
     * @return
     */
    public static String monthName(int monthName) {

        if (monthName > 0 && monthName < 13) {
            switch (monthName) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
            }
        }
        return "Error. Wrong month number";
    }

    /**
     * Reformat Days of Month in numbers - 01
     * @param month
     * @return
     */

    public static int returnDaysInMonth (int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return 0;
        }
    }

    /**
     * Reformat date in numbers - 01
     * @param date
     * @return
     */

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number);
        } else {
            return date;
        }
    }

    /**
     * create Random
     * @param n, m
     * @return number
     */

    public static int createRandom(int n, int m) {
        int number = (int) (Math.random() * (m - n + 1) + n);
        return number;
    }

    /**
     * get Largest Digit from a number
     * @param num
     * @return Math.max(digit, max) else 0
     */
    public static int getLargestDigit(int num) {
        num = Math.abs(num);   // make sure num is positive
        if (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            int max = getLargestDigit(num / 10);
            System.out.println(max);
            return Math.max(digit, max);
        } else {
            return 0;
        }
    }

}
