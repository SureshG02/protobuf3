package com.digia.protobuf.HelloWorld;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		HelloWorldProtos.HelloWorld hello = HelloWorldProtos.HelloWorld.newBuilder().setStatus("Good")
				.setMessage("Hello World").build();
		System.out.println(hello);
		System.out.println(hello.getSerializedSize());
		
		String json = "{"+"\""+"status"+"\":"+"\""+"Good"+"\",\""+"message"+"\":\""+"Hello World"+"\"}";
        System.out.println("JSON String "+json);
        System.out.println(json.getBytes().length);
        
		FileOutputStream fos = new FileOutputStream("protooutput");	
		hello.writeTo(fos);
        fos.close();
	
	}
}
