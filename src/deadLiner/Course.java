package deadLiner;
import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseIid;
    private String courseTitle;
    private List<CourseSection>sections;

    public Course(String courseIid, String courseTitle, List<CourseSection> sections) {
        this.courseIid = courseIid;
        this.courseTitle = courseTitle;
        this.sections = new ArrayList<>();
    }

    public String getCourseIid() {
        return courseIid;
    }

    public void setCourseIid(String courseIid) {
        this.courseIid = courseIid;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public List<CourseSection> getSections() {
        return sections;
    }

    public void addSection(CourseSection section){
        sections.add(section);
    }

    public void removeSection(CourseSection section){
        sections.remove(section);
    }
}
