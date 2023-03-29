package FlyweightPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 16:20
 */
public class ConcreteWebSite extends WebSite {
    // 共享的部分，内部状态
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式是：" + type + "使用者是：" + user.getName());
    }
}
