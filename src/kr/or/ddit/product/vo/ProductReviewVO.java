package kr.or.ddit.product.vo;

public class ProductReviewVO {

	private int r_code;
	private int p_code;
	private String r_content;
	private String r_date;
	private int r_score;
	private int r_count;
	private int fo_code;
	private String r_title;
	private int do_code;
	
	public int getDo_code() {
		return do_code;
	}
	public void setDo_code(int do_code) {
		this.do_code = do_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public void setFo_code(int fo_code) {
		this.fo_code = fo_code;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public int getR_code() {
		return r_code;
	}
	public void setR_code(int r_code) {
		this.r_code = r_code;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public int getR_score() {
		return r_score;
	}
	public void setR_score(int r_score) {
		this.r_score = r_score;
	}
	public int getR_count() {
		return r_count;
	}
	public void setR_count(int r_count) {
		this.r_count = r_count;
	}

	
	
}
