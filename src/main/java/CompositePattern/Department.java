package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 17:07
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}

