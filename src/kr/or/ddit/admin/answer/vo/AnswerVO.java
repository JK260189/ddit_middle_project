package kr.or.ddit.admin.answer.vo;

public class AnswerVO {
	private int ans_code;
	private int qa_code;
	private String ans_content;
	private String ans_date;
	
	public int getAns_code() {
		return ans_code;
	}
	public void setAns_code(int ans_code) {
		this.ans_code = ans_code;
	}
	public int getQa_code() {
		return qa_code;
	}
	public void setQa_code(int qa_code) {
		this.qa_code = qa_code;
	}
	public String getAns_content() {
		return ans_content;
	}
	public void setAns_content(String ans_content) {
		this.ans_content = ans_content;
	}
	public String getAns_date() {
		return ans_date;
	}
	public void setAns_date(String ans_date) {
		this.ans_date = ans_date;
	}
}
