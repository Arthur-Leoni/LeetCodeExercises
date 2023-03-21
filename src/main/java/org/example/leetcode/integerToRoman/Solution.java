package org.example.leetcode.integerToRoman;

public class Solution {
        public static String intToRoman(int num) {
                int first = num%10;
                int second = (num / 10) %10;
                int third = (num / 100) %10;
                int fourth = (num / 1000) % 10;
                String romanResult = "";

                romanResult = thousandToRoman(fourth) + hundredToRoman(third) + tenToRoman(second) + unitToRoman(first);

                return romanResult;
        }

        private static String unitToRoman(int number) {
                String roman = "";

                if(number < 4){
                        while (number != 0){
                                roman = "I"+ roman;
                                number--;
                        }
                } else if (number == 4) {
                        roman = "IV";
                } else if(number > 4 && number < 9){
                        roman = "V"+ roman;
                        number = number -5;
                        while (number != 0){
                                roman = roman +"I";
                                number--;
                        }
                } else if (number == 9) {
                        roman = roman +"IX";
                }
                return roman;
        }


        private static String tenToRoman(int number) {
                String roman = "";

                if(number < 4){
                        while (number != 0){
                                roman = "X"+ roman;
                                number--;
                        }
                } else if (number == 4) {
                        roman = "XL";
                } else if(number > 4 && number < 9){
                        roman = "L"+ roman;
                        number = number -5;
                        while (number != 0){
                                roman = roman +"X";
                                number--;
                        }
                } else if (number == 9) {
                        roman = roman +"XC";
                }
                return roman;
        }

        private static String hundredToRoman(int number) {
                String roman = "";

                if(number < 4){
                        while (number != 0){
                                roman = "C"+ roman;
                                number--;
                        }
                } else if (number == 4) {
                        roman = "CD";
                } else if(number > 4 && number < 9){
                        roman = "D"+ roman;
                        number = number -5;
                        while (number != 0){
                                roman = roman +"C";
                                number--;
                        }
                } else if (number == 9) {
                        roman = roman +"CM";
                }
                return roman;
        }

        private static String thousandToRoman(int number) {
                String roman = "";

                if(number < 4){
                        while (number != 0){
                                roman = "M"+ roman;
                                number--;
                        }
                } else if (number >= 4) {
                        roman = "Out of Range";
                }
                return roman;
        }

}