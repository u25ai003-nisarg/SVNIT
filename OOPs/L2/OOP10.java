package OOPs.L2;
class Date
{
    int month;
    int day;
    int year;
    Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void DisplayDate()
    {
        System.out.println(day+"/"+month+"/"+year);
    }
}

public class OOP10 {
    public static void main(String[] args) {
        Date d = new Date(17,06,2008);
        d.DisplayDate();
    }
}
