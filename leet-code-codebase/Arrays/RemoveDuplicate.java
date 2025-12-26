class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
     TreeSet<Integer> set = new TreeSet<>();
     for(int i =0;i<nums.length;i++){
        set.add(nums[i]);
     }
     int k =0;
     for(int unquie : set){
        nums[k++]=unquie;
     }
     return set.size();
    }
}