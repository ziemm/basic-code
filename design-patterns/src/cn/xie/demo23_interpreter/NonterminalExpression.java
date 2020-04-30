package cn.xie.demo23_interpreter;

/**
 * @author: xie
 * @create: 2020-04-30 10:00
 **/
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
