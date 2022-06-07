package com.Safayet;

public class Student {

        private int studentId ;
        private String StudentName;
        private Double StudentCGPA ;
        public Student()
        {

        }
        public Student( int studentId, String studentName, Double studentCGPA) {
            this.studentId = studentId;
            this.StudentName = studentName;
            this.StudentCGPA = studentCGPA;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
        public int getStudentId()
        {
            return studentId;
        }
        public void setStudentName(String studentName) {
            StudentName = studentName;
        }
        public String getStudentName() {
            return StudentName;
        }
        public void setStudentCGPA(Double studntCGPA) {
            StudentCGPA = studntCGPA;
        }
        public Double getStudentCGPA() {
            return StudentCGPA;
        }
        public String toString()
        {
            return " "+studentId+" "+StudentName+" "+ StudentCGPA;
        }
    }

