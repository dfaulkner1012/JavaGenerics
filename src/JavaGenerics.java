public class JavaGenerics {
    public static void main(String[] args) {
        /*
            Create an abstract Student class with the following fields

                    - student ID
                    - fname
                    - lname
                    - email

            Give it the following methods
                    - constructor
                    - getters

            Create a BiologyStudent class and a EconStudent class that extend
                    the abstract class. These should both just have a constructor that
            invokes the super class.

            Create a Classrooms class and give it a generic type that extends Student.
            Instances of this class should specify the subject. For example, biologyClass
            and econClass. Each classroom should only be able to add students for that
            subject.

                    This class should have the following fields:

                    - name
                    - classroomSize - this represents the number of enrolled students. Initialize
            this to 0. This will be incremented each time a student is added.
                    - ArrayList of students - give it the same generic type as the Classroom
            class declaration

            The class should have the following methods:

                    - Constructor that only takes a name
                    - Method to add a student. It takes a student object using the same generic
            type as the Classroom class decleration
                    - Method that returns the number of students enrolled

            In your main method, show me that you've tested your code.
        */
        BiologyStudent andydavis = new BiologyStudent(12,"Andy","Davis","adavis@gmail.com");

        Classrooms<BiologyStudent> students = new Classrooms<>("BioNerds");

        students.addStudent(andydavis);

        EconStudent juanmorales = new EconStudent(23,"Juan","Morales","jm@gmail.com");

        Classrooms<EconStudent> students2 = new Classrooms<>("EconNerds");

        students2.addStudent(juanmorales);

        System.out.println(students.numStudents());
        System.out.println(students2.numStudents());
    }
}
