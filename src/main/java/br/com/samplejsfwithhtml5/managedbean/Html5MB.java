package br.com.samplejsfwithhtml5.managedbean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Html5MB {

	private String search;
	private String email;
	private String password;
	private Date date;
	private Integer number;
	private Date dataValidacao;
	private Integer range;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDataValidacao() {
		return dataValidacao;
	}

	public void setDataValidacao(Date dataValidacao) {
		this.dataValidacao = dataValidacao;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public String buscar() {
		System.out.println(this);
		return null;
	}

	public String enviar() {
		System.out.println(this);
		return null;
	}

	@Override
	public String toString() {
		return "Html5MB [search=" + search + ", email=" + email + ", password="
				+ password + ", date=" + date + ", number=" + number
				+ ", dataValidacao=" + dataValidacao + ", range=" + range + "]";
	}

}
