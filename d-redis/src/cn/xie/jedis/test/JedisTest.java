package cn.xie.jedis.test;

import cn.xie.jedis.utils.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Map;
import java.util.Set;

/**
 * jedis测试类
 * @author: xie
 * @create: 2019-11-25 19:58
 **/
public class JedisTest {
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //2.操作
        jedis.set("username","zhangsan");
        //3.关闭连接
        jedis.close();

    }
    @Test
    public void test2(){
        //获取连接
        Jedis jedis = new Jedis();//空参构造是test1中默认值

        jedis.set("username","zhangsan");
        String username = jedis.get("username");
        System.out.println(username);

        //设置过期时间
        jedis.setex("activecode",20,"hehe");//存入后20s后删除
        jedis.close();
    }

    @Test
    public void test3(){
        //1. 获取连接
        Jedis jedis = new Jedis();//如果使用空参构造，默认值 "localhost",6379端口
        //2. 操作
        // 存储hash
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","female");

        // 获取hash
        String name = jedis.hget("user", "name");
        System.out.println(name);


        // 获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");

        // keyset
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            //获取value
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }

        //3. 关闭连接
        jedis.close();
    }
    @Test
    /*
    jedis连接池的使用
     */
    public void test7(){
        //创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);
        //1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);

        //2.获取连接
        Jedis jedis = jedisPool.getResource();
        //3. 使用
        jedis.set("hehe","heihei");


        //4. 关闭 归还到连接池中
        jedis.close();;
    }
    @Test
   public void test8(){
        Jedis jedis = JedisPoolUtils.getJedis();

        jedis.set("hello","world");

        jedis.close();
    }

}
