import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public EmployeeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        System.out.printf("Compare %s and %s\n",o1,o2);
        if (o1 instanceof Freelancer && o2 instanceof Freelancer)
        {
            if (sortType == SortType.Ascending){
                return Integer.compare(((Freelancer) o1).rating, ((Freelancer) o2).rating);
            }
            else {
                return Integer.compare(((Freelancer) o2).rating, ((Freelancer) o1).rating);
            }
        }
        else {
            if (sortType == SortType.Ascending){
                return Double.compare(o1.calculateSalary(), o2.calculateSalary());
            }
            else {
                return Double.compare(o2.calculateSalary(), o1.calculateSalary());
            }
        }

    }
}
