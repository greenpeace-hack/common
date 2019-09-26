package org.demo;

import org.apache.camel.Exchange;
import java.io.*;
import java.util.Random;
import java.util.HashMap;

public class Event {
	
	int counter = 0;

	// HashMap clients = new HashMap();


	//test response
	String ack = "{\n    \"status\":\"ack\"\n}";

	String type;

	HashMap data = new HashMap();

	//sets ACK response
	public void setType(String type)
	{
		this.type = type;
	}

	//sets ACK response
	public String getType()
	{
		return type;
	}

	public void setData()
	{
		data.put("data1","1");
		data.put("data2","2");
		data.put("data3","3");
	}

	public HashMap getData()
	{
		return data;
	}
}
