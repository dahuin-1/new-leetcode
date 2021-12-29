package programmers.str;

public class lotto {
    public static void main(String[] args) {
        lotto l = new lotto();
        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};
        l.solution(lottos,win_nums);
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int zeroCount = 0;
        int maxRank = 0, minRank = 0;
        for (int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        correct++;
                        //확실히 일치하지 않는 애들 = 6 - zeroCount - correct
                    }
                }
            }
        }
        if(zeroCount == 0 && correct == 0) {
            maxRank = 6;
        } else {
            maxRank = 7 - (zeroCount + correct);
        }
        if(correct == 0){
            minRank = 6;
        }else {
            minRank = 7 - correct;
        }
        int[] answer = new int[2];
        answer[1] = minRank;
        answer[0] = maxRank;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}
