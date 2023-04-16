package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{20, 30, 40}, {25, 40, 55}, {120, 40, 60}};
        int wealthiest = maximumWealth(arr);
        System.out.println(wealthiest);
    }
    public static int maximumWealth(int[][] accounts){
        int wealthiestPerson = 0;
        int temp = 0;
        for (int person = 0; person < accounts.length; person++){
            int money = 0;
            for (int bankAccount = 0; bankAccount < accounts[person].length; bankAccount++){
                money += accounts[person][bankAccount];
            }
            if (money > wealthiestPerson){
                wealthiestPerson = money;
            }
        }
        return wealthiestPerson;
    }
}
