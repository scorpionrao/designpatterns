package structural.composite.advanced.examplebook;

import java.util.List;

public interface ITeacherComponent {
    void addTeacher(ITeacherComponent teacher);
    void removeTeacher(ITeacherComponent teacher);
    String getDetails();
    List<ITeacherComponent> getControllingDepartments();
}
