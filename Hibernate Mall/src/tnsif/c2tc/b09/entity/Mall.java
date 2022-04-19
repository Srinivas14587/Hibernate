package tnsif.c2tc.b09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mall {
	@Id
	private long id;
	private String mallName;
	private String location;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + "]";
	}
	

}
