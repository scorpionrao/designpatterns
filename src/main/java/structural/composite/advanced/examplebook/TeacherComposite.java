package structural.composite.advanced.examplebook;

import java.util.LinkedList;
import java.util.List;

public class TeacherComposite implements ITeacherComponent, Cacheable {

    private String teacherName;
    private String departmentName;
    // if order matters
    private List<ITeacherComponent> controls = new LinkedList<ITeacherComponent>();
    private boolean isCacheValid = true;

    TeacherComposite(String teacherName, String departmentName) {
        this.teacherName = teacherName;
        this.departmentName = departmentName;
    }

    public void addTeacher(ITeacherComponent teacher) {
        isCacheValid = false;
        controls.add(teacher);
    }

    public void removeTeacher(ITeacherComponent teacher) {
        isCacheValid = false;
        controls.remove(teacher);
    }

    public List<ITeacherComponent> getControllingDepartments() {
        return controls;
    }

    public String getDetails() {
        return this.teacherName + " is the " + departmentName;
    }

    public boolean isCacheValid() {
        return isCacheValid;
    }
}
