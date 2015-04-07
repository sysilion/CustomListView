package tk.bizu.customlistview;

public class CustomDTO {
	
	String title;
	String describe;
	int image;
	
	String detail;
	
	public CustomDTO(String title, String describe, int image, String detail){
		this.title = title;
		this.describe = describe;
		this.image = image;
		this.detail = detail;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	
}
