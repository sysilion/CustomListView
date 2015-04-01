package tk.bizu.customlistview;

public class CustomDTO {
	
	String title;
	String describe;
	int image;
	
	public CustomDTO(String title, String describe, int image){
		this.title = title;
		this.describe = describe;
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	
}
