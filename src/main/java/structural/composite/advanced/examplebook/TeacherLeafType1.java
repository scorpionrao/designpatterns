package structural.composite.advanced.examplebook;

import java.util.List;

public class TeacherLeafType1 implements ITeacherComponent {

    private String teacherName;
    private String departmentName;
    private List<ITeacherComponent> controls = null;

    TeacherLeafType1(String teacherName, String departmentName) {
        this.teacherName = teacherName;
        this.departmentName = departmentName;
    }

    public void addTeacher(ITeacherComponent teacher) {
        throw new UnsupportedOperationException();
    }

    public void removeTeacher(ITeacherComponent teacher) {
        throw new UnsupportedOperationException();
    }

    public List<ITeacherComponent> getControllingDepartments() {
        return controls;
    }

    public String getDetails() {
        return this.teacherName + " is the " + departmentName;
    }
}
