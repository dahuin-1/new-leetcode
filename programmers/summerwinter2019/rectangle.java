package programmers.summerwinter2019;

public class rectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println( r.solution(8,12));

    }
    public long solution(int w, int h) {
        long all = (long) w * h;
        int newW = Math.max(w,h);
        int newH = Math.min(w,h);
        int cluster;
        long problem = 0;
        if(newW % newH == 0) { //나누어 떨어짐
           // if(newW % 2 == 0 && newH % 2 ==0) {
            problem = (long) newH * ((newW / newH) + 1 ) - 1;
           // }
        } else {
            if(newW % 2 == 0 && newH % 2 ==0) {
                cluster = newW / newH + 1;
                System.out.println(cluster);
                problem = (long) cluster * newH;
            }else  if (newW % 2 != 0 && newH % 2 !=0) {
                cluster = newW / newH + 1;
                problem = (long) cluster * newH + 1;
            }else{
                cluster = newW / newH + 1;
                problem = (long) cluster * newH;
            }
            /*if (all % 2 == 0) {
                //짝수
                if (newW % newH == 0) {
                    cluster = newW / newH;
                } else {
                    cluster = newW / newH + 1;

                }
                problem = (long) cluster * newH;
            } else {
                //홀수
            }*/
        }
        long answer = all - problem;
        return answer;
    }
}
