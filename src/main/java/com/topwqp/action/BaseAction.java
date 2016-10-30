package com.topwqp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.slf4j.LoggerFactory;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/30 0030.
 */
public class BaseAction extends ActionSupport {
    protected static org.slf4j.Logger log = LoggerFactory.getLogger(BaseAction.class);
    /**
     * 获取请求对象
     */
    protected HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    /**
     * 获取相应对象
     */
    protected HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

    /**
     * 获取session
     */
    protected HttpSession getSession() {
        return getRequest().getSession();
    }

}
