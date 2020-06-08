package cf.gofo;

public class Admin extends User {
    public Admin(String superAdmin) {
        super(superAdmin);
    }

    public Admin() {
        super();
    }

    public void approvePlayground(Playground toApprove){
        if(toApprove.isApproved()){
            System.out.println("Playground has been already approved!");
        }
        else{
            toApprove.setApproved(true);
            System.out.println("Playground approved successfully!");
        }
    }
    public void activatePlayground(Playground toActivate){
        if(toActivate.isActive()){
            System.out.println("Playground has been already activated!");
        }
        else{
            toActivate.setActive(true);
            System.out.println("Playground activated successfully!");
        }
    }
    public void suspendPlayground(Playground toSuspend){
        if(!toSuspend.isActive()){
            System.out.println("Playground has been already susspended!");
        }
        else{
            toSuspend.setActive(false);
            System.out.println("Playground suspended successfully!");
        }
    }
}
