package POJO;

public class Results 
{
	private int total_cases;
	private int total_recovered;
	private int total_unresolved;
	private int total_deaths;
	private int total_new_cases_today;
	private int total_new_deaths_today;
	private int total_active_cases;
	private int total_serious_cases;
	private int total_affected_countries;
	private Source source;
	
	public int getTotal_cases() {
		return total_cases;
	}
	public int getTotal_recovered() {
		return total_recovered;
	}
	public int getTotal_unresolved() {
		return total_unresolved;
	}
	public int getTotal_deaths() {
		return total_deaths;
	}
	public int getTotal_new_cases_today() {
		return total_new_cases_today;
	}
	public int getTotal_new_deaths_today() {
		return total_new_deaths_today;
	}
	public int getTotal_active_cases() {
		return total_active_cases;
	}
	public int getTotal_serious_cases() {
		return total_serious_cases;
	}
	public int getTotal_affected_countries() {
		return total_affected_countries;
	}
	public Source getSource() {
		return source;
	}
}