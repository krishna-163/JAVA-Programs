package com.pratice;

public class EqualandHash {
	public String name;
	public int id;

	EqualandHash(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		EqualandHash eq = (EqualandHash) obj;

		return (eq.name == this.name && eq.id == this.id);
	}

	public static void main(String[] args) {

		EqualandHash g1 = new EqualandHash("Hii", 1);
		EqualandHash g2 = new EqualandHash("Byee", 1);

		if (g1.hashCode() == g2.hashCode()) {

			if (g1.equals(g2))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");

		} else
			System.out.println("Both Objects are not equal. ");
	}

}
