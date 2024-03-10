public class course {
    public String course[] = { "C#", "Applied statistics", "JAVA" };
    public int marks[] = { 70, 100, 30 };

    public void displaymarks() {
        System.out.println("Marks optained for courses:");
       for (int i=0;i<3;i++){
        System.out.println("Courses:"+course[i]+"Marks:"+marks[i]);
       }
    }
    public static void main(String[] args) {
        course o=new course();
        o.displaymarks();
    }
}

