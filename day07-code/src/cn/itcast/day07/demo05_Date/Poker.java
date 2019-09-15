package cn.itcast.day07.demo05_Date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author: xie
 * @create: 2019-09-14 17:45
 **/
public class Poker {
    public static void main(String[] args) {
        //准备牌
        //存储牌的集合
        ArrayList<String> pokerBox = new ArrayList<String>();
        ArrayList<String> collors = new ArrayList<String>();
        ArrayList<String> numbers = new ArrayList<String>();

        collors.add("♥");
        collors.add("♠");
        collors.add("♦");
        collors.add("♣");

        for (int i = 2; i <= 10; i++) {
            numbers.add(i+""); //最快转化为字符串的形式
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

       //创造牌
        for (String color : collors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }

        //大小王
        pokerBox.add("小King");
        pokerBox.add("大King");

       // System.out.println(pokerBox);

        //利用工具类打乱顺序，相当于洗牌
        Collections.shuffle(pokerBox);
       // System.out.println(pokerBox);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            //留三张底牌
            if(i>=51){
                dipai.add(card);
            }
            if(i%3==0){
                player1.add(card);
            }else if(i%3==1){
                player2.add(card);
            }else{
                player3.add(card);
            }
        }

        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌"+dipai);


    }
}
