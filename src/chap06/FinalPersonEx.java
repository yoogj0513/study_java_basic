package chap06;

public class FinalPersonEx {
    public static void main(String[] args) {
        FinalPerson p1 = new FinalPerson("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // final 필드는 값 수정 불가
        //p1.nation = "usa";
        //p1.ssn = "987654-9876543";
        p1.name = "을지문덕";
    }
}
