package base;

import java.io.*;

public class TriangleException extends Exception{
	private Triangle t;
	
	public TriangleException(Triangle t){
		super();
		this.t = t;
	}
	
	

}