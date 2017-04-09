
package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 2/7/2017.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Context context, ArrayList<ReportCard> reportCard) {
        super(context, 0, reportCard);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.subject, parent, false);
        }

        ReportCard currentReport = getItem(position);

        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject_text_view);

        subjectTextView.setText(currentReport.getmSubjectName());

        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);

        gradeTextView.setText(currentReport.getmGrade());

        return listItemView;
    }
}
