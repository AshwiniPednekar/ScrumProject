
public class Sprints {

    public Task tasks[];

    public Sprints(Task t[]) {
        tasks = t;
    }
    
     public void printSprintBlog(){
        for(int i =0 ; i<tasks.length;i++){
            System.out.println("\n"+tasks[i].task+" | "+tasks[i].status+" | "+tasks[i].hours);
        }
    }

}
