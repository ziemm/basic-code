package cn.xie.demo15_memento.demo;

/**
 * @author: xie
 * @create: 2020-04-21 11:03
 **/
public class GameRole {
    //游戏的各种状态
    private int vit;
    private int atk;
    private int def;

    public void initState(){
        vit=100;
        atk=100;
        def=100;
    }

    //后续还会有对状态的各种操作
    // ......

    //保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    //恢复角色状态
    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void stateDispaly(){
        System.out.println("1:"+vit+"  2:"+atk+"  3:"+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
