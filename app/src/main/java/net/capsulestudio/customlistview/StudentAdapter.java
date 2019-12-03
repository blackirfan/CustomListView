package net.capsulestudio.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter {
    public  Context context;
    public  int resID;
    ArrayList<StudentDataModel> dataList;


    // ekhane StudentAdapter er ekta constructor banano hoyeche

    public StudentAdapter( Context context, int resource, ArrayList<StudentDataModel> dataList) {
        super(context, resource, dataList);

        this.context = context;
        this.resID  = resource;
        this.dataList = dataList;
    }


    @Override
    public int getCount() {
        return dataList.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(resID, null);

        TextView tvName =  view.findViewById(R.id.tv_name);
        TextView tvPhone =  view.findViewById(R.id.tv_phone);
        TextView tvEmail =  view.findViewById(R.id.tv_email);

        StudentDataModel dataModel = dataList.get(position);

        tvName.setText(dataModel.getName());
        tvEmail.setText(dataModel.getEmail());
        tvPhone.setText(dataModel.getPhone());

        tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Cicked On Phone", Toast.LENGTH_LONG).show();
            }
        });

        return view;

    }
}
