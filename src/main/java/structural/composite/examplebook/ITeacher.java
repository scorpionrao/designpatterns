package structural.composite.examplebook;

import java.util.List;

public interface ITeacher {
    void addTeacher(ITeacher teacher);
    void removeTeacher(ITeacher teacher);
    String getDetails();
    List<ITeacher> getControllingDepartments();
}
