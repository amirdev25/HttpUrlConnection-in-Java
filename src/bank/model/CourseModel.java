package bank.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CourseModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("Code")
	private String code;

	@SerializedName("Ccy")
	private String ccy;

	@SerializedName("CcyNm_RU")
	private String ccyNmRU;

	@SerializedName("CcyNm_UZ")
	private String ccyNmUZ;

	@SerializedName("CcyNm_UZC")
	private String ccyNmUZC;

	@SerializedName("CcyNm_EN")
	private String ccyNmEN;

	@SerializedName("Nominal")
	private String nominal;

	@SerializedName("Rate")
	private String rate;

	@SerializedName("Diff")
	private String diff;

	@SerializedName("Date")
	private String date;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCcy(String ccy){
		this.ccy = ccy;
	}

	public String getCcy(){
		return ccy;
	}

	public void setCcyNmRU(String ccyNmRU){
		this.ccyNmRU = ccyNmRU;
	}

	public String getCcyNmRU(){
		return ccyNmRU;
	}

	public void setCcyNmUZ(String ccyNmUZ){
		this.ccyNmUZ = ccyNmUZ;
	}

	public String getCcyNmUZ(){
		return ccyNmUZ;
	}

	public void setCcyNmUZC(String ccyNmUZC){
		this.ccyNmUZC = ccyNmUZC;
	}

	public String getCcyNmUZC(){
		return ccyNmUZC;
	}

	public void setCcyNmEN(String ccyNmEN){
		this.ccyNmEN = ccyNmEN;
	}

	public String getCcyNmEN(){
		return ccyNmEN;
	}

	public void setNominal(String nominal){
		this.nominal = nominal;
	}

	public String getNominal(){
		return nominal;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getRate(){
		return rate;
	}

	public void setDiff(String diff){
		this.diff = diff;
	}

	public String getDiff(){
		return diff;
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
			"CourseModel{" + 
			"id = '" + id + '\'' + 
			",code = '" + code + '\'' + 
			",ccy = '" + ccy + '\'' + 
			",ccyNm_RU = '" + ccyNmRU + '\'' + 
			",ccyNm_UZ = '" + ccyNmUZ + '\'' + 
			",ccyNm_UZC = '" + ccyNmUZC + '\'' + 
			",ccyNm_EN = '" + ccyNmEN + '\'' + 
			",nominal = '" + nominal + '\'' + 
			",rate = '" + rate + '\'' + 
			",diff = '" + diff + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}