package POJO;

import java.util.List;

public class List_of_user 
{
	private int page;
	private int per_page;
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public List<Data_1> getData() {
		return data;
	}
	public Ad getAd() {
		return ad;
	}
	private int total;
	private int total_pages;
	private List<Data_1> data;
	private Ad ad;
}
