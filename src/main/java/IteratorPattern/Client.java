package IteratorPattern;

import java.util.ArrayList;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:34
 */
public class Client {
    public static void main(String[] args) {
        // 创建学院
        ArrayList<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();

    }
}
