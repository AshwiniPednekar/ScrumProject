
public class ScrumProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner owner = new Owner("manju");
        ScrumMater sm = new ScrumMater("manasvi");
        String memebers[] = {"boi","sid"};
        TeamMembers tm = new TeamMembers(memebers);
        
        UserStory us[] = new UserStory[2];
        us[0] = new UserStory("as a user i want to.", 2, 3);
        us[1] = new UserStory("as a user i want to..", 1, 4);
        
        ProductBacklog pblog = new ProductBacklog(us);
        
        Task tsk[] = new Task[2];
        tsk[0] = new Task("task 1", "To Do", 3);
        tsk[1] = new Task("task 2", "Doing", 3);
        
        Sprints slog = new Sprints(tsk);
        
        Project pro = new Project("Myproject",owner,sm,tm,pblog,slog);
        
        pro.pbacklock.printProductBlog();
         pro.sbacklock.printSprintBlog();
    }
    
}

	