package cn.xie.demo24_interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-04-30 10:01
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }
}
