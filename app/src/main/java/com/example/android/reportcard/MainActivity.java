package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCard = new ArrayList<ReportCard>();

        reportCard.add(new ReportCard("Mathematics", "A"));
        reportCard.add(new ReportCard("Physics", "A+"));
        reportCard.add(new ReportCard("Chemistry", "B"));
        reportCard.add(new ReportCard("English", "A+"));
        reportCard.add(new ReportCard("Hindi", "A"));
        reportCard.add(new ReportCard("Sanskrit", "B"));
        reportCard.add(new ReportCard("Electronics", "A"));
        reportCard.add(new ReportCard("CS", "B"));
        reportCard.add(new ReportCard("Physical Edu.", "A+"));



        ReportCardAdapter adapter = new ReportCardAdapter(this, reportCard);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
