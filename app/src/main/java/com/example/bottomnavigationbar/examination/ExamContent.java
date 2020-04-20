package com.example.bottomnavigationbar.examination;

public class ExamContent {

    private String exam_type, exam_date;
    private int exam_image;

    public ExamContent(String exam_type, String exam_date, int exam_image) {
        this.exam_type = exam_type;
        this.exam_date = exam_date;
        this.exam_image = exam_image;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public int getExam_image() {
        return exam_image;
    }

    public void setExam_image(int exam_image) {
        this.exam_image = exam_image;
    }
}
