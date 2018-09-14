package com.Nine.Sky_lnn.bean;

public class Dlxxb {
	/**个人编号*/
	private String grbh;
	/**账号*/
	private String zh;
	/**密码*/
	private String pwd;
	/**身份标志*/
	private String sfbz;
	/**头像*/
	private String tx;
	
	public Dlxxb() {}

	public Dlxxb(String grbh, String zh, String pwd, String sfbz, String tx) {
		super();
		this.grbh = grbh;
		this.zh = zh;
		this.pwd = pwd;
		this.sfbz = sfbz;
		this.tx = tx;
	}

	public String getGrbh() {
		return grbh;
	}

	public void setGrbh(String grbh) {
		this.grbh = grbh;
	}

	public String getZh() {
		return zh;
	}

	public void setZh(String zh) {
		this.zh = zh;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSfbz() {
		return sfbz;
	}

	public void setSfbz(String sfbz) {
		this.sfbz = sfbz;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	@Override
	public String toString() {
		return "Dlxxb [grbh=" + grbh + ", zh=" + zh + ", pwd=" + pwd + ", sfbz=" + sfbz + ", tx=" + tx + "]";
	}
	
	
}
