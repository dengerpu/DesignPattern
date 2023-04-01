package IteratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:02
 */
// 系
public class Department {
    private String name;
    private String Desc;

    public Department(String name, String desc) {
        this.name = name;
        Desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

}
