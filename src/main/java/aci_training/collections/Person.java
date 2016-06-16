package aci_training.collections;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	
	private String name;
	private String address;
	private int age;
	
	
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person o) {
		if (address.compareTo(o.address) != 0) {
			return address.compareTo(o.address);
		}
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	public static Comparator<Person> nameAddressComparator() {

		
		Comparator<Person> comparator = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.name.compareTo(o2.name) == 0) {
					return o1.address.compareTo(o2.address);
				}
				return o1.name.compareTo(o2.name);
			}
		};
		
		return comparator;
	}
	
	

}
