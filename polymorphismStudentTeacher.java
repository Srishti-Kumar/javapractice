package classpracticeJAVA5;

public class polymorphismStudentTeacher {
    static class person{
        String name;
        String email;
    }

    static class Student extends person{
        int claass;
    }

    static class Teachers extends person{
        int YrsExperience;
    }
    public static void main(String[] args){
        person std1 = new Student(); //polymorphism
        person std2 = new Teachers();
        std1.name = "srishti";
        std1.email = "s@gmail.com";

        std2.name = "sr";
        std2.email = "s@yahoo.com";
        //std2 is objct of person but some how cant access students variables
        //here childrens obj is treated as obj of parents

        Student student = new Student();
        student.claass = 5;
        student.email= "dsddd";
        Teachers teachers = new Teachers();
        teachers.YrsExperience  = 23;


    }
}
