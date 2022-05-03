//Greedy solution 
//Indian coin 

//TC - 0(amount)
//Aux S - 0(1)



class Solution{
    private static int[] coins = new int[]{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
    static List<Integer> minPartition(int N)
    {
       List<Integer> ans = new ArrayList<>();
       int i = coins.length-1;
       
       while(N != 0){
           if(coins[i] > N){
              i--;
              continue;
           }
            ans.add(coins[i]);
             N-= coins[i];
       }
       return ans; 
    }
}
