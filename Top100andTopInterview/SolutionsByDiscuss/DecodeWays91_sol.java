package Top100andTopInterview.SolutionsByDiscuss;

public class DecodeWays91_sol {

    public static void main(String[] args) {
        DecodeWays91_sol decodeWays = new DecodeWays91_sol();
        decodeWays.numDecodings("102213");
    }

    public int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) - '0' == 0) { //비어있거나 0으로 시작하거든 진행불가
            return 0;
        }
        int[] waysToDecode = new int[s.length() + 1];
        waysToDecode[0] = 1;
        waysToDecode[1] = 1;

        for (int i = 1; i < s.length(); i++) {
            int curr = s.charAt(i) - '0';
            int prev = s.charAt(i - 1) - '0';

            // can't make progress, return 0
            if (prev == 0 && curr == 0 || (curr == 0 && (prev * 10 + curr > 26))) {
                //현재가 0인데 과거도 0이거나 || 현재가 0인데 int(과거+현재) 가 26을 넘으면 진행불가
                return 0;
            }
            // can't use the previous value, so can only get to this state from the previous
            else if (prev == 0 || (prev * 10 + curr) > 26) {
                //이전 값이 0이면 이전 값을 사용할 수 없다 01은 불가능 || int(과거+현재) 가 26을 넘으면 (28)
                waysToDecode[i + 1] = waysToDecode[i];
                //현재값을 다음 배열에 붙여야한다. 0,1+0
            }
            // can't use current state, can only get to this state from i - 1 state
            else if (curr == 0) {
                //현재가 0이면
                waysToDecode[i + 1] = waysToDecode[i - 1];
                //이전값을 사용해야 한다. (이전 값에 붙여야한다) 1+0
            }
            // can get to this state from the previous two states
            else {
                //이전 값과 현재 값을 모두 사용할수 있다면, 둘다 쌉가능이기에 둘다 저장해준다
                //122[1] -> 1+2,2 / 1,2+2
                //dp[3] = 2
                waysToDecode[i + 1] = waysToDecode[i] + waysToDecode[i - 1];
            }
        }
        return waysToDecode[waysToDecode.length - 1];
    }

}
