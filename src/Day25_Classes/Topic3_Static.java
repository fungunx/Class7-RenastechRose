package Day25_Classes;

public class Topic3_Static {

    public static void main(String[] args) {

        RenastechStudentRegistrationForm Myform = new RenastechStudentRegistrationForm();
        Myform.Name = "Hayri";
        Myform.Surname="Aslam";

        System.out.println(Myform.Name);

        RenastechStudentRegistrationForm MyNewForm = new RenastechStudentRegistrationForm();

        System.out.println(MyNewForm.Name);





    }

    static class RenastechStudentRegistrationForm{

        /*
        The static keyword in Java mainly used for memory management
        The static variable can be used to refer the common  property of all objects
        (Which is not unique for each object
        In other words, a static field is shared by all copies of the class, thus all see the same

        for example the company name, college name etc.
        Suppose there are 500 students in the college. That's mean 500 student registration form.
        Now all fields will get memory each time when you crate the object (your registration form)
        All students have it's unique Name and Surname. So copy of Fields are good in such case.
        Here "School" refers to the common Field of all copy of objects.
        If we make it static, this field will get the memory only once.
         */
      static String Name;
        static String Surname;

        static String School = "Renastech";
    }
}
