package IteratorPattern;

import java.util.Iterator;
import java.util.List;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:28
 */
public class OutPutImpl {
    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        // 从collgeList去除所有学院，Java的list已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("=======" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
