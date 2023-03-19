package UML.generalization;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 16:49
 */
public class PersonServiceBean extends DaoSupport{
    public void save(Object entity){
        System.out.println("save");
    }
    public void delete(Object id){
        System.out.println("delete");
    }
}
