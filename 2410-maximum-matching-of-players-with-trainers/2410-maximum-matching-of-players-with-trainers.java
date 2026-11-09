class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pi=0;
        int ti=0;
        int count=0;
        while(pi<players.length && ti<trainers.length){
            int a=players[pi];
            int b=trainers[ti];
            if(a<=b){pi++;ti++;count++;}
            else{ti++;}
        }
        return count;
    }
}