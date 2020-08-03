package cn.xie.base01.demo01;

import java.util.BitSet;

/**
 * @author: xie
 * @create: 2020-07-07 08:44
 **/
public class MyBloomFilter {

    public static void main(String[] args) {
        String value1 = "https://javaguide.cn/";
        String value2 = "https://github.com/Snailclimb";
        MyBloomFilter filter = new MyBloomFilter();
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
        filter.add(value1);
        filter.add(value2);
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
    }

    //位数组大小
    private static final int DEFAULT_SIZE=2 << 24;

    private static final int[] SEEDS = new int[]{3,13,46,72,91,134};

    //位数组
    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash[] func = new SimpleHash[SEEDS.length];

    public MyBloomFilter(){
        for (int i = 0; i < SEEDS.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE,SEEDS[i]);
        }
    }

    public void add(Object value){
        for (SimpleHash f : func) {
            bits.set(f.hash(value),true);
        }
    }

    public boolean contains(Object value){
        boolean ret = true;
        for (SimpleHash f : func) {
            ret = ret && bits.get(f.hash(value));
        }
        return ret;
    }

    /**
     * 静态内部类，用于hash操作
     */
    private static class SimpleHash {
        private int cap;
        private  int seed;

        public SimpleHash(int cap,int seed){
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(Object value){
            int h;
            return (value == null) ? 0 : Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)));
        }
    }
}
