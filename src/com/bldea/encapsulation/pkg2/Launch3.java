package com.bldea.encapsulation.pkg2;
class plane{
	void takeoff() {
		System.out.println("plane took off");
		
	}
	void fiy() {
		System.out.println("plane flying");
		
	}
	void  land() {
		System.out.println("plane landed");
		
	}
}
	
	class CargoPlane extends plane{
		void fly() {
			System.out.println("CargoPlane is flying at low height");
			
		}
		void carryGoods() {
			System.out.println("Cargoplane carry goods");
		}
	}
		class FighterPlane extends plane{
			void fly() {
				System.out.println("FighterPlane is flying at high level");
				
			}
			void  carryweapon (){
				System.out.println("FighterPlane carry weapon");
			}
		}

			class PassengerPlane extends plane{
				void fly() {
					System.out.println("PassengerPlane is flying at medium height");
					
				}
				void carrypassenger () {
					System.out.println("PassegerPlane carry Passnger");
				}
				
				
			}
public class Launch3 {

	public static void main(String[] args) {
		CargoPlane  cp = new CargoPlane () ;
	    FighterPlane fp = new FighterPlane();
	    PassengerPlane pp = new  PassengerPlane ();
	           cp.takeoff();
	           cp.fly();
	           cp.land();
	           cp.carryGoods();
	  System.out.println("--------------");
               fp.takeoff();
               fp.fly();
               fp.land();
               fp.carryweapon();
        System.out.println("--------------");
               pp.takeoff();
               pp.fly();
               pp.land();
               pp.carrypassenger();
       System.out.println("--------------");

	    }
	}



