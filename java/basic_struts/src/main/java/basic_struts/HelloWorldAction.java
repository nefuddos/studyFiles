package basic_struts;

import com.opensymphony.xwork2.ActionSupport;
import basic_struts.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private MessageStore messageStore;
	public String execute() {
		messageStore = new MessageStore();
		return SUCCESS;
	}
	public MessageStore getMessageStore() {
		return messageStore;
	}
}
