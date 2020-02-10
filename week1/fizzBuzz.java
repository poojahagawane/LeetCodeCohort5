class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        Boolean isnum;
        for(int i = 1; i <= n; i++) {
            isnum = true;
            StringBuilder each = new StringBuilder();
            if(i%3 == 0)
            {
                each.append("Fizz");
                isnum = false;
            }
            if(i%5 == 0)
            {
                each.append("Buzz");
                isnum = false;
            }
            if(isnum)
            {
                each.append(String.valueOf(i));
            }
            ans.add(each.toString());
        }
        return ans;
    }
}
