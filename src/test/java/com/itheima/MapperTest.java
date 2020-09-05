package com.itheima;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试类
 * @author tangkaihua
 * @create 2020-05-30-14:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MapperTest {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() throws JsonProcessingException {
        // 从redis缓存中获得指定的数据
        String s = redisTemplate.boundValueOps("user.queryUserList").get();

        // 缓存里面为空
        if (s==null){
            // 查询数据库获得数据
            List<User> userList = userDao.queryUserList();

            //转换成json格式字符串
            ObjectMapper om = new ObjectMapper();
            s = om.writeValueAsString(userList);
            //将数据存储到redis中，下次在查询直接从redis中获得数据，不用在查询数据库
            redisTemplate.boundValueOps("user.queryUserList").set(s);
            System.out.println("===============从数据库获得数据===============");

        }else{
            System.out.println("===============从redis缓存中获得数据===============");
        }

        System.out.println(s);
    }
}
