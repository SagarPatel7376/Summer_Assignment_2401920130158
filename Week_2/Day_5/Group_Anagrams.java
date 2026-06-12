class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String abc = new String(word);

            if(!(map.containsKey(abc))){
                map.put(abc,new ArrayList<>());
            }
            map.get(abc).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
