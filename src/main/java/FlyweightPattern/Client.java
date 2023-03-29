package FlyweightPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 16:30
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSite("微博");
        webSite.use(new User("张三"));

        WebSite webSite1 = webSiteFactory.getWebSite("公众号");
        webSite1.use(new User("李四"));

        WebSite webSite2 = webSiteFactory.getWebSite("微博");
        webSite2.use(new User("张三1"));

        WebSite webSite3 = webSiteFactory.getWebSite("微博");
        webSite3.use(new User("张三2"));
        WebSite webSite4 = webSiteFactory.getWebSite("微博");
        webSite4.use(new User("张三3"));

        System.out.println(webSiteFactory.getWebSiteCount());

    }
}
