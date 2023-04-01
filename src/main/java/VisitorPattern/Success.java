package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:21
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + " 给的评价：该歌手成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + " 给的评价：该歌手成功");
    }
}
