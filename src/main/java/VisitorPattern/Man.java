package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:17
 */
public class Man extends Person{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
