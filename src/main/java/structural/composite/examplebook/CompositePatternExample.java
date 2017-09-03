package structural.composite.examplebook;

import java.util.List;
/*
Components:
    - Interface representing responsibilities of a teacher

 */
public class CompositePatternExample {

    static void printCompany(ITeacher teacher) {
        System.out.println("**COMPOSITE PATTERN DEMO**");
        System.out.println("**College Structure**");
        System.out.println(teacher.getDetails());
        List<ITeacher> hods = teacher.getControllingDepartments();
        for(ITeacher t : hods) {
            System.out.println("\t" + t.getDetails());
        }
        List<ITeacher> mathTeachers = hods.get(0).getControllingDepartments();
        for(ITeacher t : mathTeachers) {
            System.out.println("\t\t" + t.getDetails());
        }
        List<ITeacher> computerTeachers = hods.get(1).getControllingDepartments();
        for(ITeacher t : computerTeachers) {
            System.out.println("\t\t" + t.getDetails());
        }
    }

    public static void main(String[] args) {
        ITeacher teacher1 = new Teacher("Teacher1", "College");
        ITeacher teacher2 = new Teacher("Teacher2", "MathematicsHod");
        ITeacher teacher3 = new Teacher("Teacher3", "ComputerScienceHod");

        ITeacher teacher4 = new Teacher("Teacher4", "MathematicsTeacher");
        ITeacher teacher5 = new Teacher("Teacher5", "MathematicsTeacher");
        ITeacher teacher6 = new Teacher("Teacher6", "ComputerScienceTeacher");
        ITeacher teacher7 = new Teacher("Teacher7", "ComputerScienceTeacher");
        ITeacher teacher8 = new Teacher("Teacher8", "ComputerScienceTeacher");

        /* Root Node */
        teacher1.addTeacher(teacher2);
        teacher1.addTeacher(teacher3);

        /* Intermediate root node */
        teacher2.addTeacher(teacher4);
        teacher2.addTeacher(teacher5);
        /* Intermediate root node */
        teacher3.addTeacher(teacher6);
        teacher3.addTeacher(teacher7);
        teacher3.addTeacher(teacher8);

        /* Leaf Node */
        teacher4.addTeacher(null);
        teacher5.addTeacher(null);
        teacher6.addTeacher(null);
        teacher7.addTeacher(null);
        teacher8.addTeacher(null);

        printCompany(teacher1);

        // One teacher leaving
        System.out.println("\n**After a Computer TeacherComposite leaves**\n");
        teacher3.removeTeacher(teacher7);
        printCompany(teacher1);

    }
}
