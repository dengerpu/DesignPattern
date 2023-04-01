package IteratorPattern;

import java.util.Iterator;
import java.util.List;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:11
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院
    int index = -1; // 索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // 判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
