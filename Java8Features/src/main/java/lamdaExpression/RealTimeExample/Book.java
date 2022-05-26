package lamdaExpression.RealTimeExample;

import java.util.Objects;

public class Book {
	
	private int id;
	private String name;
	private int ages;
	
	
	public Book(int id, String name, int ages) {
		super();
		this.id = id;
		this.name = name;
		this.ages = ages;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAges() {
		return ages;
	}
	
	public void setAges(int ages) {
		this.ages = ages;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ages, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return ages == other.ages && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", ages=" + ages + "]";
	}
	
	
	
	

}
