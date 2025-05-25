package deadLiner;
import java.util.List;
public class Course {
    private String courseIid;
    private String courseTitle;
    private String courseDescription;
    private List<CourseSection>sections;

    public Course(String courseIid, String courseTitle, String courseDescription, List<CourseSection> sections) {
        this.courseIid = courseIid;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.sections = sections;
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

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public List<CourseSection> getSections() {
        return sections;
    }

    public void setSections(List<CourseSection> sections) {
        this.sections = sections;
    }
    public void addSection(CourseSection section){
        if (section !=null){
            addSection(section);
        }
    }
    public void removeSection(CourseSection section){
        removeSection(section);
    }
}
