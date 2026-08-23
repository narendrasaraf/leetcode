class Solution {
    public boolean sumGame(String num) {
        int mid = num.length() / 2;
        int leftSum = 0;
        int rightSum = 0;
        int leftMark = 0;
        int rightMark = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i < mid) {
                if (num.charAt(i) == '?') leftMark++;
                else leftSum += num.charAt(i) - '0';
            } else {
                if (num.charAt(i) == '?') rightMark++;
                else rightSum += num.charAt(i) - '0';
            }
        }
        return 2 * (leftSum - rightSum)!=9*(rightMark - leftMark);
    }
}