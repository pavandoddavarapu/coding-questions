class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> ls=new ArrayList<>();
        for(int i=0;i<restaurants.length;i++){
            int price=restaurants[i][3];
            int distance=restaurants[i][4];
            int vegan=restaurants[i][2];
            if(price<=maxPrice && distance<=maxDistance &&(veganFriendly==0 || vegan==1)){ls.add(restaurants[i]);}

        }
        Collections.sort(ls,
        (b,a)->{

            if(a[1]!=b[1])return a[1]-b[1];
            else{return a[0]-b[0];}
        }
        );
        List<Integer> ans=new ArrayList<>();
        for(int[] l:ls){
            ans.add(l[0]);
        }
        return ans;
    }
}