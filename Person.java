package person;

public class Person {
	private String name;
    private int age;
    private long salary;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    @Override
	public int  hashCode() {
    	final int result = 100;
    	int c = age;
        int res = 37 * result + c;
        return res;
    }
    	    
   	@Override
    public boolean equals(Object obj) {

        Person person = (Person) obj;
        return getName().equals(person.getName()) && (getAge() == person.getAge()) && (getSalary() == person.getSalary());
    }
    
    

}
