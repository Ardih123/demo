package com.example.demo.mensagem;

public class MensagemSimples {

	private boolean statusOK;
	private String info;
	
	public MensagemSimples(boolean statusOK, String info) {
		this.statusOK = statusOK;
		this.info = info;
	}

	public boolean isStatusOK() {
		return statusOK;
	}

	public String getInfo() {
		return info;
	}

	public void setStatus(boolean statusOK) {
		this.statusOK = statusOK;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "{\r\n"
				+ "    \"status\": "+ isStatusOK() +",\r\n"
				+ "    \"info\": "+ getInfo() +"\r\n"
				+ "}";
	}
	
	
}
