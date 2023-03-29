package ProxyPattern.staticProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 18:33
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理，完成某些操作");
        iTeacherDao.teach();
        System.out.println("提交....");
    }
}
