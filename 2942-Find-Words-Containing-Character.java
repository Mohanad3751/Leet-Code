class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList <Integer> lis = new ArrayList<Integer>();
        String s = Character.toString(x); 
        for (int i =0; i< words.length;i++){
            if (words[i].contains(s))
            lis.add(i);
        }
        return lis;
    }
}