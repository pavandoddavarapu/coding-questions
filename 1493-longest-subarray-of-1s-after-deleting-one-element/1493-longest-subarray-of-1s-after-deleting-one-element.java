class Solution {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(i<nums.length && nums[i]==0){
                count++;i++;
            }
            if(count!=0)arr.add(count);
            count=0;
            while(i<nums.length && nums[i]==1){
                count++;i++;
            }
            if(count!=0)arr.add(count);
            i--;
        }
        int ans=0;
        for(int a: arr){System.out.print(a+" ");}
        if(arr.size()==1){
            if(nums[0]==1)return arr.get(0)-1;
            else{return 0;}
        }
        // if(arr.size()==2){
        //     if(nums[0]==1)return arr.get(0);
        //     else{return arr.get(1);}
        // }
        if(nums[0]==0){

            for(int i=1;i<arr.size();i=i+2){
                
                if(i+2<arr.size() && arr.get(i+1)==1){ans=Math.max(ans,arr.get(i)+arr.get(i+2));}
                else if(i+2<arr.size() && arr.get(i+1)>1){ans=Math.max(ans,arr.get(i));ans=Math.max(ans,arr.get(i+2));}
                else{ans=Math.max(ans,arr.get(i));}
            }
            return ans;
        }
        else{
            for(int i=0;i<arr.size();i=i+2){
                if(i+2<arr.size() && arr.get(i+1)==1){ans=Math.max(ans,arr.get(i)+arr.get(i+2));}
                else if(i+2<arr.size() && arr.get(i+1)>1){ans=Math.max(ans,arr.get(i));ans=Math.max(ans,arr.get(i+2));}
                else{ans=Math.max(ans,arr.get(i));}
            }
            return ans;
        }
        
    }
}