package TrainingCodes;
class Dog10{
	 private String name;
	 private String color;
	 private int cost;
	 
	 void setdata(String name,String color,int cost ) {
		 this.name =name;
		 this.color =color;
		 this.cost =cost;	 
	 }
	 void getData() {
		 System.out.println(name);
		 System.out.println(color);
		 System.out.println(cost);
		 
	 }
	 
		 
}

public class Launch1 {

	public static void main(String[] args) {
		Dog10 d1=new Dog10();
		//d1.name="tommy";
		//d1.color="black";
		//d1.cost=5000;
		d1.setdata("Blacky","black",5000);
		d1.getData();

		// TODO Auto-generated method stub

	}

}
