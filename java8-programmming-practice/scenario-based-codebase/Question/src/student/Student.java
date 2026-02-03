package student;

public class Student {
        private String name;
        private int id;
        private int age;
        private Gender gender;
        private String city;
        private int rank;
        private String contacts;
		public Student( int id,String name, int age, Gender gender, String city, int rank,
				String contacts) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
			this.gender = gender;
			this.city = city;
			this.rank = rank;
			this.contacts = contacts;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public String getContacts() {
			return contacts;
		}
		public void setContacts(String contacts) {
			this.contacts = contacts;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id +  ", age=" + age + ", gender="
					+ gender + ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + "]";
		}
        
        
}
