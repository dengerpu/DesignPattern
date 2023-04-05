package StatePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-05 15:05
 */
public class DispenseState extends State{

    // 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    // 发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕，后面我们就不可以抽奖
            activity.setState(activity.getDispenseState());
            System.out.println("抽奖活动结束");
            System.exit(0);
        }
    }
}
