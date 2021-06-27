package com.maxeremin.ltcd.apple.sort;

public class TopFreqWords {
    public List<String> topKFrequent(String[] words, int k) {
        if(words.length == 0) return new ArrayList<>();

        Map<String, Integer> wordMap = new HashMap<>();
        for(String word : words)
            wordMap.put(word, wordMap.getOrDefault(word, 0) +1);

        List<String>[] count = new List[words.length+1];

        for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if(count[entry.getValue()] == null)
                count[entry.getValue()] = new ArrayList<>();
            count[entry.getValue()].add(entry.getKey());
        }

        List<String> result = new ArrayList<>();
        for(int i=count.length-1; i >=0 && k > 0; i--) {
            if(count[i] == null) continue;
            Collections.sort(count[i]);
            List<String> temp = count[i].subList(0, Math.min(count[i].size(), k));
            result.addAll(temp);
            k = k - temp.size();
        }

        return result;
    }
}
