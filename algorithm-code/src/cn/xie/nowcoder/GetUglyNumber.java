package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-01 20:31
 **/
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)
            return 0;
        int[] uglys = new int[index];
        int p2=0,p3=0,p5=0,i=1;
        uglys[0]=1;
        while (i<index){
            uglys[i] = Math.min(Math.min(uglys[p2]*2,uglys[p3]*3),uglys[p5]*5);
            while (uglys[p2]*2<=uglys[i])p2++;
            while (uglys[p3]*3<=uglys[i])p3++;
            while (uglys[p5]*5<=uglys[i])p5++;
            i++;
        }
        return uglys[index-1];
    }
}
