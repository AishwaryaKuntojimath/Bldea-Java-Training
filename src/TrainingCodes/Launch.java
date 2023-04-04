package TrainingCodes;
             class Dog{
		     private String name;
			 private String color;
			 private int cost;
			 
			 void setdata(String a,String b,int c ) {
				 name =a;
				 color =b;
				 cost =c;	 
			 }
			 void getData() {
				 System.out.println(name);
				 System.out.println(color);
				 System.out.println(cost);
				 
			 }

		}       

		public class Launch {

			public static void main(String[] args) {
				Dog d1=new Dog();
				// d1.name="tommy";
				// d1,color="black;
				//d1.cost=5000;
				d1.setdata("Blacky","black",5000);
				d1.getData();
				
				// TODO Auto-generated method stub

			}

		}
		
