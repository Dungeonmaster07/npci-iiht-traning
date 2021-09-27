package iiht_Assignments;

public class ProjectHead {
    public ProjectHead (){
        int projectCost;
        int employee;
    }
}
class Project extends ProjectHead{
    void cost(int projectCost, int employee){
        int noOfEmployee=employee;
        if(projectCost>=noOfEmployee){
            System.out.println("Feasible solution");
        }else{
            System.out.println("Non-feasible solution");
        }
    }

}
