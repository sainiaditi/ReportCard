package com.example.android.reportcard;

/**
 * Created by Dell on 2/7/2017.
 */
public class ReportCard {
    //Subject Name
    private String mSubjectName;
    //Grades
    private String mGrade;

    public ReportCard(String SubjectName, String Grade) {
        setmGrade(Grade);
        setmSubjectName(SubjectName);
    }

    //set grade of subject
    public void setmGrade(String mGrade){
        this.mGrade = mGrade;
    }
    //get grade og subject
    public String getmGrade() {
        return mGrade;
    }

    //set grade of subject
    public void setmSubjectName(String mSubjectName){
        this.mSubjectName = mSubjectName;
    }
    //get Subject name
    public String getmSubjectName() {
        return mSubjectName;
    }

    @Override
    public String toString() {
        return "You Got " + mGrade + " Grade in " + mSubjectName;
    }
}
