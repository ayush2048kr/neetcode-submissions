class Solution {

    public String encode(java.util.List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String str : strs) {

            result.append(str.length());
            result.append('#');
            result.append(str);
        }

        return result.toString();
    }

    public java.util.List<String> decode(String s) {

        java.util.List<String> result = new java.util.ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find the '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Extract the length
            int length = Integer.parseInt(s.substring(i, j));

            // Move past '#'
            i = j + 1;

            // Extract the actual string
            String str = s.substring(i, i + length);

            result.add(str);

            // Move to the next encoded string
            i = i + length;
        }

        return result;
    }
}