package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:51
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + " 给的评价：该歌手待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + " 给的评价：该歌手待定");
    }
}
