import java.util.*;

public class Tram {

    public static int tramRide(int s, int x2, int t1, int pos, int dir){
        int time = 0;
        int currPos = pos;
        int currDir = dir;

        while(currPos != x2){
            if(currDir == 1){
                if(currPos <= x2){
                    time += (x2 - currPos)*t1;
                    currPos = x2;
                }
                else{
                    time += (s - currPos)*t1;
                    currPos = s;
                    currDir = -1;
                }
            }
            else{
                if(currPos >= x2){
                    time += (currPos - x2)*t1;
                    currPos = x2;
                }
                else{
                    time += currPos*t1;
                    currPos = 0;
                    currDir = 1;
                }
            }
        }

        return time;
    }
    
    public static int minTime(int s, int x1, int x2, int t1, int t2, int p, int d){
        // possibility 1 - igor can walk the entire distance
        int walkTime = Math.abs(x1 - x2)*t2;

        // possibility 2 - Igor takes the tram
        int tramTime = tramRide(s, x2, t1, p, d);

        return Math.min(walkTime, tramTime);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int p = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(minTime(s, x1, x2, t1, t2, p, d));

        sc.close();
    }
}
