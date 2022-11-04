package com.mipresupuesto.personalbudget.controller.response.dto;

import com.mipresupuesto.personalbudget.controller.response.enumeration.MessageLevel;

public class Message {
	
	private String text;
	private String  title;
	private MessageLevel level;
	
	
	private Message(String text, String title, MessageLevel level) {
		setText(text);
		setTitle(title);
		setLevel(level);
	}
	
	public static message
	
	
	


	public final String getText() {
		return text;
	}


	public final String getTitle() {
		return title;
	}


	public final MessageLevel getLevel() {
		return level;
	}


	private final void setText( final String text) {
		if(text == null || "".intern() == text.intern().trim()){
			this.text = "";
		}else {
		this.text = text.trim();
		}
	}


	private final void setTitle(String title) {
		if(title == null || "".intern() == title.intern().trim()){
			this.title = "";
		}else {
		this.title = title.trim();
		}
	}


	private final void setLevel(MessageLevel level) {
		if(level == null){
			this.level = MessageLevel.FATAL;
		}else {
		this.level = level;
		}
	}
	
	
	
	

}
