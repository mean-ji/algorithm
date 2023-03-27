package leetcode;

public class EmployeesTarget {
    public static void main(String[] args) {
        EmployeesTarget e = new EmployeesTarget();
        int[] array = {0,1,2,3,4};
        System.out.println(e.numberOfEmployeesWhoMetTarget(array, 2));
    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employeesCnt = 0;
        
        for (int hour : hours) {
            employeesCnt += hour >= target ? 1 : 0;
        }

        return employeesCnt;
    }
}
