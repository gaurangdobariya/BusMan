package com.busman.busman;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaurang on 16-12-2017.
 */

public class display extends ArrayAdapter<student>  {
        private Activity context;
        List<student> students;

        public display(Activity context, List<student> students) {
            super(context, R.layout.display, students);
            this.context = context;
            this.students = students;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View listViewItem = inflater.inflate(R.layout.display, null, true);

            TextView id_no = (TextView) listViewItem.findViewById(R.id.d_id);
            TextView stu_name= (TextView) listViewItem.findViewById(R.id.d_name);
            TextView fee = (TextView) listViewItem.findViewById(R.id.d_fees);

            student student = students.get(position);
            id_no.setText(student.getId());
            stu_name.setText(student.getName());
            fee.setText(student.getFees());

            return listViewItem;
        }

}
