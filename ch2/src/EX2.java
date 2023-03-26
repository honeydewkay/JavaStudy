public class EX2 {
    int studentID;
    String studentName;
    Subject korea;
    Subject math;

    public EX2(int id, String Name){
        studentID = id;
        studentName = Name;

        korea = new Subject();
        math = new Subject();
    }

    public void koreaSubject(String name, int score, int ID){
        korea.SubjectName = name;
        korea.score = score;
        korea.subjectID = ID;
    }

    public void setMathSubject(String name, int score, int ID){
        math.SubjectName = name;
        math.score = score;
        math.subjectID = ID;

    }

    public void showscore(){
        int total = korea.score + math.score;
        System.out.println(studentName+"출력:"+total);
    }

    public void showID(){
        int IDTotal = korea.subjectID + math.subjectID;
        System.out.println(studentName+"출력:"+IDTotal);
    }

}
