package structural.composite.examplebook;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {

    private String teacherName;
    private String departmentName;
    private List<ITeacher> controls = new ArrayList<ITeacher>();

    Teacher(String teacherName, String departmentName) {
        this.teacherName = teacherName;
        this.departmentName = departmentName;
    }

    public void addTeacher(ITeacher teacher) {
        controls.add(teacher);
    }

    public void removeTeacher(ITeacher teacher) {
        controls.remove(teacher);
    }

    public List<ITeacher> getControllingDepartments() {
        return controls;
    }

    public String getDetails() {
        return this.teacherName + " is the " + departmentName;
    }
}
