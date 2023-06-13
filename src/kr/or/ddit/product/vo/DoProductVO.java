package kr.or.ddit.product.vo;

import java.util.List;

public class DoProductVO {

	private int bus_code;
	private int do_code;
	private int h_code;
	private int do_min;
	private int do_max;
	private int do_price;
	private int do_valid;
	private String do_img;
	private String do_department;
	private String do_arrival;
	private String do_name;
	private String do_content;
	private List<Pack_ImgVO> iList;
	
	public List<Pack_ImgVO> getiList() {
		return iList;
	}
	public void setiList(List<Pack_ImgVO> iList) {
		this.iList = iList;
	}
	public String getDo_content() {
		return do_content;
	}
	public void setDo_content(String do_content) {
		this.do_content = do_content;
	}
	public int getBus_code() {
		return bus_code;
	}
	public void setBus_code(int bus_code) {
		this.bus_code = bus_code;
	}
	public int getDo_code() {
		return do_code;
	}
	public void setDo_code(int do_code) {
		this.do_code = do_code;
	}
	public int getH_code() {
		return h_code;
	}
	public void setH_code(int h_code) {
		this.h_code = h_code;
	}
	public int getDo_min() {
		return do_min;
	}
	public void setDo_min(int do_min) {
		this.do_min = do_min;
	}
	public int getDo_max() {
		return do_max;
	}
	public void setDo_max(int do_max) {
		this.do_max = do_max;
	}
	public int getDo_price() {
		return do_price;
	}
	public void setDo_price(int do_price) {
		this.do_price = do_price;
	}
	public int getDo_valid() {
		return do_valid;
	}
	public void setDo_valid(int do_valid) {
		this.do_valid = do_valid;
	}
	public String getDo_img() {
		return do_img;
	}
	public void setDo_img(String do_img) {
		this.do_img = do_img;
	}
	public String getDo_department() {
		return do_department;
	}
	public void setDo_department(String do_department) {
		this.do_department = do_department;
	}
	public String getDo_arrival() {
		return do_arrival;
	}
	public void setDo_arrival(String do_arrival) {
		this.do_arrival = do_arrival;
	}
	public String getDo_name() {
		return do_name;
	}
	public void setDo_name(String do_name) {
		this.do_name = do_name;
	}
	
	
}
