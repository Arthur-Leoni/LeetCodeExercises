package findPivotIndex724;

public class Solution {
        public static int[] runningSum(int[] nums) {
                int [] resultado = new int[nums.length];
                int lastSum = 0;
                int count = 0;

                for (int num :nums) {
                        resultado[count] = num + lastSum;
                        lastSum = lastSum + num;
                        count++;
                }

        return resultado;
        }

}