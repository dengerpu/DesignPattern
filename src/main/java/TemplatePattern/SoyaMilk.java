package TemplatePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-30 15:07
 */
// 抽象类， 表示豆浆
public abstract class SoyaMilk {

    // 模板方法，make,模板方法可以做成final类，不让子类覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    // 选材料
    void select() {
        System.out.println("第一步：选择新鲜黄豆");
    }
    // 添加不同的配料，抽象方法，子类去实现
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机区打碎");
    }
}
