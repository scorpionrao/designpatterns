package structural.composite.advanced.examplebook;

import java.util.List;

/*
Components:
    - Interface representing responsibilities of a teacher

 */
public class CompositePatternExample {

    static void printCompany(ITeacherComponent teacher) {
        System.out.println("**COMPOSITE PATTERN DEMO**");
        System.out.println("**College Structure**");
        System.out.println(teacher.getDetails());
        List<ITeacherComponent> hods = teacher.getControllingDepartments();
        for(ITeacherComponent t : hods) {
            System.out.println("\t" + t.getDetails());
        }
        List<ITeacherComponent> mathTeachers = hods.get(0).getControllingDepartments();
        for(ITeacherComponent t : mathTeachers) {
            System.out.println("\t\t" + t.getDetails());
        }
        List<ITeacherComponent> computerTeachers = hods.get(1).getControllingDepartments();
        for(ITeacherComponent t : computerTeachers) {
            System.out.println("\t\t" + t.getDetails());
        }
    }

    public static void main(String[] args) {
        ITeacherComponent teacher1 = new TeacherComposite("Teacher1", "College");
        ITeacherComponent teacher2 = new TeacherComposite("Teacher2", "MathematicsHod");
        ITeacherComponent teacher3 = new TeacherComposite("Teacher3", "ComputerScienceHod");
        ITeacherComponent teacher3_1 = new SpecialRoleLeafType3("Teacher3_1", "SpecialAdvisor");

        ITeacherComponent teacher4 = new TeacherLeafType1("Teacher4", "MathematicsTeacher");
        ITeacherComponent teacher5 = new LabAssistantLeafType2("Teacher5", "MathematicsTeacher");
        ITeacherComponent teacher6 = new TeacherLeafType1("Teacher6", "ComputerScienceTeacher");
        ITeacherComponent teacher7 = new TeacherLeafType1("Teacher7", "ComputerScienceTeacher");
        ITeacherComponent teacher8 = new LabAssistantLeafType2("Teacher8", "ComputerScienceTeacher");

        /* Root Node */
        teacher1.addTeacher(teacher2);
        teacher1.addTeacher(teacher3);
        teacher1.addTeacher(teacher3_1);

        /* Intermediate root node */
        teacher2.addTeacher(teacher4);
        teacher2.addTeacher(teacher5);
        /* Intermediate root node */
        teacher3.addTeacher(teacher6);
        teacher3.addTeacher(teacher7);
        teacher3.addTeacher(teacher8);

        printCompany(teacher1);

        // One teacher leaving
        System.out.println("\n**After a Computer TeacherComposite leaves**\n");
        teacher3.removeTeacher(teacher7);
        printCompany(teacher1);

    }
}
