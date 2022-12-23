package model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class BankCourseModelDTO implements Serializable {

	@SerializedName("title")
	private String title;

	@SerializedName("code")
	private String code;

	@SerializedName("cb_price")
	private String cbPrice;

	@SerializedName("nbu_buy_price")
	private String nbuBuyPrice;

	@SerializedName("nbu_cell_price")
	private String nbuCellPrice;

	@SerializedName("date")
	private String date;

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCbPrice(String cbPrice){
		this.cbPrice = cbPrice;
	}

	public String getCbPrice(){
		return cbPrice;
	}

	public void setNbuBuyPrice(String nbuBuyPrice){
		this.nbuBuyPrice = nbuBuyPrice;
	}

	public String getNbuBuyPrice(){
		return nbuBuyPrice;
	}

	public void setNbuCellPrice(String nbuCellPrice){
		this.nbuCellPrice = nbuCellPrice;
	}

	public String getNbuCellPrice(){
		return nbuCellPrice;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"BankCourseModelDTO{" + 
			"title = '" + title + '\'' + 
			",code = '" + code + '\'' + 
			",cb_price = '" + cbPrice + '\'' + 
			",nbu_buy_price = '" + nbuBuyPrice + '\'' + 
			",nbu_cell_price = '" + nbuCellPrice + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}