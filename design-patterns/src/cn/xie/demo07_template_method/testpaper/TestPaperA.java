package cn.xie.demo07_template_method.testpaper;

/**
 * 只需重写回答问题的三个方法
 * @author: xie
 * @create: 2020-04-19 10:16
 **/
public class TestPaperA extends TestPaper {

    @Override
    protected String Answer1() {
        return "c";
    }

    @Override
    protected String Answer2() {
        return "c";
    }

    @Override
    protected String Answer3() {
        return "c";
    }
}
