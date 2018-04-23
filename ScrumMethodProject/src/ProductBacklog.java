
public class ProductBacklog {

    public UserStory us[];

    public ProductBacklog(UserStory u[]) {
        us = u;
    }
    
    public void printProductBlog(){
        for(int i =0 ; i<us.length;i++){
            System.out.println("\n"+us[i].story+" | "+us[i].point+" | "+us[i].priority);
        }
    }

}
