class LCP {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       
        int n = strs.length-1;
        int i =0;
        while(i<strs[0].length()&&i<strs[n].length()&&strs[0].charAt(i)==strs[n].charAt(i)){
            i++;
        }


        String name =strs[0].substring(0,i);
        return name;
    }
}