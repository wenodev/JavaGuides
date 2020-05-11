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
        projectDao.saveProject(project);

        List< Project > projects = projectDao.getProjects();
        projects.forEach(s -> {
                System.out.println(s.getProjectName());
        System.out.println(s.getProjectStatus());
        });
    }
}
