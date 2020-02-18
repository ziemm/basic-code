package cn.itcast.day07.demo11_enum;

public enum Season implements Behavior{
    SPRING("春天",1),
    SUMMER("夏天",2),
    AUTUMN("秋天",3),
    WINTER("冬天",4);

    private String name;
    private int index;

    Season(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void print() {
        System.out.println("输出索引:"+this.getIndex());
    }
}
