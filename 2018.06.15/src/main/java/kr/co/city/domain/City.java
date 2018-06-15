package kr.co.city.domain;

public class City {
	
	private int cityid;
	private String cityname;
	private String country;
	private String pictureurl;
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPictureurl() {
		return pictureurl;
	}
	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}
	
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", country=" + country + ", pictureurl="
				+ pictureurl + "]";
	}
	
	

}
