package openSource.jedis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by newland on 2015/5/28.
 */
public class JedisUtil {
    private static JedisPool jedisPool;
    private static void initPool(String ip,int port){
        jedisPool =new JedisPool(new JedisPoolConfig(),ip,port,2000);
    }
}
