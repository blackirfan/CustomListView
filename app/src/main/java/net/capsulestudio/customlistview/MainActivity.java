package net.capsulestudio.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        ArrayList<StudentDataModel> studentList = Data.getStudentList();


        //ekhane student Adapter er moddhe context , layout , studentlist send kra holo

        StudentAdapter studentAdapter = new
                StudentAdapter(MainActivity.this, R.layout.raw_student, studentList);


        // ekhane list view er majhe student adapter ta set kora holo

        listView.setAdapter(studentAdapter);

    }
}
