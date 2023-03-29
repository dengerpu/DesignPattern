package ProxyPattern.staticProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 18:32
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中....");
    }
}
