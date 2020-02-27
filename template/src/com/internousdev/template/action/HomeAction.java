package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
//ActionSupportクラスを継承(extends)→Ctrl+下にカーソル「宣言を開く」
	public String execute() {
		return SUCCESS;
	}
//executeメソッドを実行した後はsuccessを返す→struts.xml

}
