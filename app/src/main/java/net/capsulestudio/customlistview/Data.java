package net.capsulestudio.customlistview;

import java.util.ArrayList;

public class Data {

    public static ArrayList<StudentDataModel> getStudentList(){



        //eta ekta studentDataModel class type ekta array list

        ArrayList<StudentDataModel> studentName = new ArrayList<>();


        // array list e value input kora holo...

        studentName.add(new StudentDataModel("Rahim","03842497", "Rahim@gmail.com"));
        studentName.add(new StudentDataModel("Karim","937237", "Karim@gmail.com"));
        studentName.add(new StudentDataModel("Jamal","25243325", "Jamal@gmail.com"));
        studentName.add(new StudentDataModel("Kamal","568458", "Kamal@gmail.com"));
        studentName.add(new StudentDataModel("baro","564353458", "Kdffdfamal@gmail.com"));
        studentName.add(new StudentDataModel("sufiya","45", "Kamal@gmail.com"));

        //array list method e return kora holo

        return studentName;
    }
}
