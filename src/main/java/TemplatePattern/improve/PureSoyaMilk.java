package TemplatePattern.improve;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-30 15:40
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        // 空实现
    }

    @Override
    Boolean customerWantCondiments() {
        return false;
    }
}
