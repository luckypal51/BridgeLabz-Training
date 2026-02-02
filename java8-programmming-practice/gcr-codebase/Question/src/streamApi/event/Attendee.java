package streamApi.event;

public class Attendee {
        public String name;
        public boolean attending;
        
		public Attendee(String name, boolean attending) {
			this.name = name;
			this.attending = attending;
		}
        
      public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isAttending() {
			return attending;
		}

		public void setAttending(boolean attending) {
			this.attending = attending;
		}

	  @Override
    public String toString() {
    return "\n Welcome To the part "+this.name;
    }  
}
