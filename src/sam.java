
class Xyz{
	String name;
		int age;
		void speak() {
			for(int i=0;i<3;i++) {
			System.out.println("My name is "  +  name  + " " + "and I'm "  + " " + age  +  "old");
			}
		}
			int calculateYearsToRetirement() {
				int yearsLeft=65 - age;
				return yearsLeft;
				
			
		}	
		
}
public class sam {
public static void main(String[] args) {
	Xyz person1 = new Xyz();
	person1.name= "Joe";
	person1.age= 34;
	person1.speak();
	int years = person1.calculateYearsToRetirement();
	System.out.println("Years till retirement : " + years);
	
	Xyz person2 = new Xyz();
	person2.name = "Sana";
	person2.age = 34;
	person2.speak();
System.out.println(person1.name);
System.out.println(person2.age);
}

}
