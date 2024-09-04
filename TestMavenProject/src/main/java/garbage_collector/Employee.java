package garbage_collector;

public class Employee {
	private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    protected void finalize() throws Throwable {
        // Print a message when the object is garbage collected
        System.out.println("Employee object with ID " + id + " is being garbage collected!");
        super.finalize();
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }


}
