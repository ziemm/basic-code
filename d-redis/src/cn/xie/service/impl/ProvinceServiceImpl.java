package cn.xie.service.impl;

import cn.xie.dao.ProvinceDao;
import cn.xie.dao.impl.ProvinceDaoImpl;
import cn.xie.domain.Province;
import cn.xie.jedis.utils.JedisPoolUtils;
import cn.xie.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author: xie
 * @create: 2019-11-26 19:40
 **/
public class ProvinceServiceImpl implements ProvinceService {
    //声明dao
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    /**
     * 使用redis缓存
     * @return
     */
    @Override
    public String findAllJson() {
      //先从jedis中查找数据
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        //判断province_json数据是否为null
        if(province_json==null||province_json.length()==0){
            //redis中没有数据
            System.out.println("redis中没数据，查询数据库...");
            //2.1从数据中查询
            List<Province> ps = dao.findAll();
            //2.2将list序列化为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //2.3将json数据存入redis
            jedis.set("province",province_json);

            //归还连接
            jedis.close();
        }else{
            System.out.println("redis中有数据，查询缓存");
        }

        return province_json;
    }
}
