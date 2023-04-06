package TrainingCodes;
import TrainingCodes.Tiger;

class Tiger{
 private String name;
	 private String color;
	 private int age;
	 private String Country ;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
}       

       public class Launch2 {

	    public static void main(String[] args) {
        Tiger t1=new Tiger();
		
		t1.setName("ramu");
		t1.setColor("orange");
		t1.setAge(5);
		t1.setCountry("india");
		
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getAge());
		System.out.println(t1.getCountry());

		}


	}


