

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class JunitTest {
    
    public JunitTest() {
        Owner owner = new Owner("manju");
        ScrumMater sm = new ScrumMater("manasvi");
        String memebers[] = {"wer","ash"};
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
