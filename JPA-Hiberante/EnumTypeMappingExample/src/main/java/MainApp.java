import dao.ProjectDao;
import entity.Project;
import entity.ProjectStatus;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        ProjectDao projectDao = new ProjectDao();


        Project project = new Project();
        project.setProjectName("TPO");
        project.setProjectStatus(ProjectStatus.INPROGESS);

        Project project1 = new Project();
        project1.setProjectName("DDD");
        project1.setProjectStatus(ProjectStatus.OPEN);

        projectDao.saveProject(project);
        projectDao.saveProject(project1);


        List< Project > projects = projectDao.getProjects();
        projects.forEach(s -> {
                System.out.println(s.getProjectName());
                System.out.println(s.getProjectStatus());
        });

        //        ProjectDao projectDao1 = new ProjectDao();
//        Project project1 = new Project();
//        project1.setProjectName("ECOMMERCE");
//        project1.setProjectStatus(ProjectStatus.OPEN);
//        projectDao1.saveProject(project1);


//        List<Project> projects1 = projectDao1.getProjects();
//        projects1.forEach(s->{
//            System.out.println(s.getProjectName());
//            System.out.println(s.getProjectStatus());
//        });



    }
}
