package cn.xie.demo14_adapter.demo;

/**
 * @author: xie
 * @create: 2020-04-21 09:53
 **/
public class Translator extends Player {
    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.attackC();
    }

    @Override
    public void defense() {
        wjzf.defenseC();
    }
}
