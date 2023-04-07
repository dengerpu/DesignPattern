package ChainOfResponsibilityPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-07 14:40
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,30001,1);

        // 创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("李副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("邓校长");

        // 需要将各个审批级别的下一个设置好（处理人构成环形）
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
        viceSchoolMasterApprover.processRequest(purchaseRequest);
    }
}
