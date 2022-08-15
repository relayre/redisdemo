import redis.clients.jedis.Jedis;

/**
 * @author May
 * @creat 2022-05-22 21:38
 */
public class JedisDemo {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.1.120",6379);
        String ping = jedis.ping();
        System.out.println(ping);

        String k1 = jedis.get("k1");
        System.out.println(k1);
        System.out.println(jedis.keys("*"));
        String set = jedis.set("k1", "v4");
        System.out.println(set);
        System.out.println(jedis.get("k1"));

        jedis.mset("k1","v1","v2");
        System.out.println(jedis.mget(k1));
    }
}
