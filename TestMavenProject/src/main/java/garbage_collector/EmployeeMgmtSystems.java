package garbage_collector;

public class EmployeeMgmtSystems {
	public static void main(String[] args) {
		
		System.out.println("Starting Employee Management System...");
        // Create and use Employee objects
        for (int i = 0; i < 10; i++) {
            Employee emp = new Employee("Employee" + i, i);
            // Optionally print employee details
            System.out.println(emp);
            // Optionally simulate work with the employee object
            try {
                Thread.sleep(200); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Clear reference to encourage garbage collection
        System.gc(); // Suggest garbage collection
 
        // Wait to observe finalize messages
        try {
            Thread.sleep(5000); // Wait for a while to allow GC to happen
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending Employee Management System...");

	}

}
