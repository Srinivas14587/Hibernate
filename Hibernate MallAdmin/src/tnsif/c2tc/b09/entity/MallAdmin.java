package tnsif.c2tc.b09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class MallAdmin {
	@Id
		private long id;
		private String name;
		private String password;
		private long phone;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
		}
		
}
