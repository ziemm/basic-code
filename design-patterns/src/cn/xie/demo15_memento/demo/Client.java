package cn.xie.demo15_memento.demo;

/**
 * @author: xie
 * @create: 2020-04-21 11:14
 **/
public class Client {
    public static void main(String[] args) {
        GameRole xiaoniao = new GameRole();
        xiaoniao.initState();
        xiaoniao.stateDispaly();

        //保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(xiaoniao.saveState());

        //更改角色状态
        xiaoniao.setVit(60);
        xiaoniao.setAtk(153);
        xiaoniao.setDef(200);
        xiaoniao.stateDispaly();

        //恢复状态
        xiaoniao.recoveryState(stateAdmin.getMemento());
        xiaoniao.stateDispaly();
    }
}
