public class Driver {
  public static void main(String[] args) {
        OnlineExamSystem exam = new OnlineExamSystem();
        try {
            exam.startExam("123");
        } catch (InValidStudentIdException e) {
            System.out.println(e.getMessage());
        }
        try {
            exam.startExam("STD123");
            exam.submitAnswer(0);
        } catch (TimeOutOfException e) {
            System.out.println(e.getMessage());
        } catch (InValidStudentIdException e) {
            System.out.println(e.getMessage());
        }


    }
}
