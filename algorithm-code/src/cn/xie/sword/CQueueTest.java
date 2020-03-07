package cn.xie.sword;

import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-03-07 22:42
 **/

public class CQueueTest {
}

/**
 * 双栈实现队列
 */
class CQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    /**
     * 注意栈2空时才可以再将栈1的数据压栈
     * @return
     */
    public int deleteHead() {
        if(!stack2.isEmpty()){//栈2不空，pop出的元素就是对头元素
            return stack2.pop();
        }else if(stack2.isEmpty()){//如果栈2空
            if(!stack1.isEmpty()){//栈1不空
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());//将所有栈1的数据压栈
                }
                return stack2.pop();
            }else {//栈1也空
                return -1;
            }
        }
        return -1;
    }
}
