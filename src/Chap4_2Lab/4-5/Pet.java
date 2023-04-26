public class Pet {
	private String name;
	private int age;
	private double weight;

	public String toString() {
		return ("Name: " + name + "\nAge: " + age + " years"
				+ "\nWeight: " + weight + " pounds");
	}

	public Pet(String name, int age, double weight) {
		if ((age < 0) || (weight < 0)) {
			System.out.println("Error: NEgative age or weight");
			System.exit(0);
		}
		else {
			this.age = age;
			this.weight = weight;
		}
	}

	public void set(String name, int age, double weight) {
		if ((age < 0) || (weight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		}
		else {
			this.age = age;
			this.weight = weight;
		}
	}

	public Pet(String name) {
		this.name = name;
		age = 0;
		weight = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Pet(int age) {
		name = "No name yet.";
		weight = 0;
		if (age < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			this.age = age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			this.age = age;
	}
	
	public Pet(double weight) {
		name = "No name yet";
		age = 0;
		if (weight < 0) {
			System.out.println("Error: Negative weight.");
			System.exit(0);
		} else
			this.weight = weight;
	}
	
	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("Error: Negative weight.");
			System.exit(0);
		} else
			this.weight = weight;
	}
	
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}
}