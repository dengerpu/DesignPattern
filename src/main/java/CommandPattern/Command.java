package CommandPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-30 20:26
 */
// 创建命令接口
public interface Command {

    // 执行动作（操作）
    public void execute();

    // 撤销动作（操作）
    public void undo();
}
