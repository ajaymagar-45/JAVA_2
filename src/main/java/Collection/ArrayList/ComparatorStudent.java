package Collection.ArrayList;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentDetails {

    private int id;
    private int rollNum;
    private String fName;
    private String lName;
    private double salary;

    public StudentDetails(){}

    public StudentDetails(int id, int rollNum, String fName, String lName, double salary) {
        this.id = id;
        this.rollNum = rollNum;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", rollNum=" + rollNum +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class FNameComparator implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getfName().compareTo(o2.getfName());
    }
}

class RollNumComparator implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getRollNum() - o2.getRollNum();
    }
}

public class ComparatorStudent {

    public static void main(String[] args) {

        StudentDetails ajit = new StudentDetails(4, 101, "Ajit", "Biradar", 90000);
        StudentDetails prathamesh = new StudentDetails(2, 105, "Prathamesh", "Gajre", 98000);
        StudentDetails shivmangal = new StudentDetails(1, 102, "Shivmangal", "Biradar", 105000);
        StudentDetails dinesh = new StudentDetails(3, 103, "Dinesh", "Shrirame", 95000);
        StudentDetails manish = new StudentDetails(5, 104, "Manish", "Bhavsar", 99000);

        List<StudentDetails> studentDetailsList = new ArrayList<>();

        studentDetailsList.add(ajit);
        studentDetailsList.add(prathamesh);
        studentDetailsList.add(shivmangal);
        studentDetailsList.add(dinesh);
        studentDetailsList.add(manish);

        System.out.println("Before sorting "+studentDetailsList);
        /*FNameComparator fNameComparator = new FNameComparator();

        Collections.sort(studentDetailsList, fNameComparator);

        System.out.println("After sorting "+studentDetailsList);

        RollNumComparator rollNumComparator = new RollNumComparator();

        Collections.sort(studentDetailsList, rollNumComparator);

        System.out.println("After sorting using roll num "+studentDetailsList);*/

        Comparator<StudentDetails> idComparator = new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                return o1.getId() - o2.getId();
            }
        };

        Collections.sort(studentDetailsList, idComparator);
        System.out.println("After sorting using id  "+studentDetailsList);

        //Lambda expression

    }
}
