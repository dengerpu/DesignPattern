package IteratorPattern;

import java.util.Iterator;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:16
 */
public interface College {

    public String getName();

    // 增加系的方法
    public void addDepartment(String name, String desc);

    // 返回一个迭代器，遍历
    public Iterator createIterator();
}
