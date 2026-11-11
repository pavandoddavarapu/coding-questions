class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int count=0;
        Integer ans[]=new Integer[aliceValues.length];
        for(int i=0;i<ans.length;i++)ans[i]=i;
        Arrays.sort(ans,(b,a)->{return (aliceValues[a]+bobValues[a])-(aliceValues[b]+bobValues[b]);});
        boolean flag=true;
        for(int i=0;i<ans.length;i++){
            if(flag){count+=aliceValues[ans[i]];flag=false;}
            else{count-=bobValues[ans[i]];flag=true;}
        }
        if(count>0)return 1;
        else if(count<0)return -1;
        else return 0;
    }
}