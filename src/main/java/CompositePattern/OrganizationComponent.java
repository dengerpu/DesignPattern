package CompositePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 16:40
 */
public abstract class OrganizationComponent {
    private String name; // 名字
    private String des; // 说明

    public void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }
    // 构造器

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    // 方法print做成抽象的，子类需要实现
    public abstract void print();
}
