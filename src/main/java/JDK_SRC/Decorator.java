package JDK_SRC;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 15:23
 */
public class Decorator {
    public static void main(String[] args) throws IOException {
        //说明
        // 1. InputStream是抽象类，类似我们前面讲的Drink
        // 2. FileInputStream是 InputStream子类，类似我们前面的DeCaf, LongBlack1l
        // 3. FilterInputStream是InputStream子类:类似我们前面的 Decorator修饰者
        // 4. DataInputStream是 FilterInputStream子类，具体的修饰者，类似前面的Milk, Soy等l1
        // 5.FilterInputStream类有protected volatile InputStream in;即含被装饰者
        // 6.分析得出在jdk 的 io体系中，就是使用装饰者模式

        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
