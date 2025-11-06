import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class Runner {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport h = new EmployeeReport();
        s.print();
        h.print();
        System.out.println("company report done");
    }
}
