public class OnlineExamSystem{
    public void startExam(String studentID)throws InValidStudentIdException{
        if(studentID==null||!studentID.startsWith("STD")){
            throw new InValidStudentIdException("invalid student id");
        }
    }
    public void submitAnswer(int time) throws TimeOutOfException{
        if(time<=0){
            throw new TimeOutOfException("time is up ");
        }
    }
}
