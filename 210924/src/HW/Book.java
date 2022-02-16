package HW;

public class Book {
		String Title;
		String Name;
		int Released;
		
		Book(String title, String name, int released){
			this.Title = title;
			this.Name = name;
			this.Released = released;
		}
		public String getTitle() {
			return Title;
		}


		public void setTitle(String title) {
			Title = title;
		}


		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public int getReleased() {
			return Released;
		}


		public void setReleased(int released) {
			Released = released;
		}
		public String showBookInfo() {
			return ("제목:"+Title+"\n"+"저자:"+Name+"\n"+"출판년도:"+Released+"\n");
		}
		
		
		
		
		
	
	}


