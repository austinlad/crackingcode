class q12 {
    static final Map<Character,Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    public int romanToInt(String s) {
       int sum = 0;
       int last = 0;
       for(char c : s.toCharArray()) {
           Integer value = map.get(c);
           sum += value;
           if (last < value) {
               sum -= 2*last;
           }
           last = value;
       }
        return sum;
    }
}
