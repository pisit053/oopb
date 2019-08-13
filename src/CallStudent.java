public class CallStudent {
    //psvm + eab
    public static void main(String[] args) {
        Student Focus = new Student();
        System.out.println(">>" + Focus);
        Focus.enrollment();
        Focus.payment();
        Focus.addCourse();
        Focus.dropCourse();
        System.out.println("===============");
        GraduatsStudent shaghy = new GraduatsStudent();
        shaghy.enrollment();
        shaghy.addCourse();
        shaghy.dropCourse();
        shaghy.payment();
        shaghy.oralExamination();
        shaghy.thesisExamination();
    }
}//end class
