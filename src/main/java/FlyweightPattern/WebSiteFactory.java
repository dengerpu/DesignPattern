package FlyweightPattern;

import java.util.HashMap;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 16:23
 */
// 网站工厂类
public class WebSiteFactory {

    // 集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pools = new HashMap<>();

    // 根据网站的类型，返回一个网站，如果没有就创建一个，并放入到池中，并返回。
    public WebSite getWebSite(String type) {
        if ( !pools.containsKey(type)) {
            pools.put(type, new ConcreteWebSite(type));
        }
        return pools.get(type);
    }

    // 获取网站的总数
    public int getWebSiteCount() {
        return pools.size();
    }
}
