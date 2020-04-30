package cn.xie.demo24_interpreter;

/**
 * @author: xie
 * @create: 2020-04-30 09:59
 **/
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
