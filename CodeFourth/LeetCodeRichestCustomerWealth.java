//https://leetcode.com/problems/richest-customer-wealth/
public class LeetCodeRichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 5, 6}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            //now we have sum of accounts of person
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}