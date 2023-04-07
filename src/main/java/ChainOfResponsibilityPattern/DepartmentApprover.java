package ChainOfResponsibilityPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-07 14:34
 */
public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号id=" + purchaseRequest.getId()+" 被 "+ this.name+"处理");
        } else {
           approver.processRequest(purchaseRequest);
        }
    }
}
