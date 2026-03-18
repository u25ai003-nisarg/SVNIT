
class Course {
    int memberID;
    String Description;
    String Duration;
    float fees;

    Course(int memberID, String Description, String Duration, float fees) {
        this.memberID = memberID;
        this.Description = Description;
        this.Duration = Duration;
        this.fees = fees;
    }

    void getData() {
        System.out.println("\n\nDetails :-\n");
        System.out.println("Member Id = " + memberID);
        System.out.println("Description = " + Description);
        System.out.println("Duration = " + Duration);
        System.out.println("Fees = " + fees);
    }
}

public class OOP42 {
    static void main(String[] args) {

        Course c1 = new Course(5214,"Student - UG", "4 Years", 80000);
        Course c2 = new Course(45621,"Student - PG", "5 Years", 150000);
        Course c3 = new Course(48569,"Student - Phd.", "3 Years", 210000);
        Course c4 = new Course(7895,"Student - Mtech", "2 Years", 190000);
        Course c5 = new Course(5241,"Faculty", "Permanent", 0);

        Course[] Team = {c1,c2,c3,c4,c5};

        for(Course person : Team) {
            person.getData();
        }

    }
}