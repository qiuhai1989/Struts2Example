package com.topwqp.action;

//import org.apache.log4j.Logger;
import org.apache.struts2.RequestUtils;
import org.slf4j.LoggerFactory;

public class UserAction extends  BaseAction{

	protected static org.slf4j.Logger log = LoggerFactory.getLogger(UserAction.class);

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * http://localhost:8080/user/Welcome
	 * @return
     */
	public  String execute(){
		String uri = RequestUtils.getUri(getRequest());
//		System.out.println("uri="+uri);
		log.info("uri="+uri);
		return "SUCCESS";
	}

}
