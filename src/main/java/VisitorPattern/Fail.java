package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:19
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + " 给的评价：该歌手失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + " 给的评价：该歌手失败");
    }
}
