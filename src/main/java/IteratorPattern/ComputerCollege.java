package IteratorPattern;

import java.util.Iterator;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:18
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0; // 保存当前数组的对象个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA专业", "JAVA专业");
        addDepartment("PHP专业", "PHP专业");
        addDepartment("大数据专业", "大数据专业");
        addDepartment("人工智能专业", "人工智能专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment ++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
