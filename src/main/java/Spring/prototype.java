package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 10:56
 */
public class prototype {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 获取monster[通过id获取monster]
        Object bean = applicationContext.getBean("id01");
        System.out.println("bean" + bean); // 输出 "牛魔王" .....

        Object bean2 = applicationContext.getBean("id01");

        System.out.println("bean2" + bean2); //输出 "牛魔王" .....

        System.out.println(bean == bean2); // false
    }
}
