package cn.xie.demo07_template_method.testpaper;

/**
 * 考试卷
 * @author: xie
 * @create: 2020-04-19 10:06
 **/
public class TestPaper {
    public  void question1(){
        System.out.println("试题1题目及选项");
    }
    public void question2(){
        System.out.println("试题2题目及选项");
    }
    public void question3(){
        System.out.println("试题3题目及选项");
    }

    protected String Answer1(){
    return "";
    }
    protected String Answer2(){
        return "";
    }
    protected String Answer3(){
        return "";
    }
}
