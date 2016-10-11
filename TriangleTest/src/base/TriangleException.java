package base;

import java.io.*;

public class TriangleException extends Exception{
	private Triangle triangle;
	
	public TriangleException(Triangle triangle){
		super();
		this.triangle = triangle;
	}
	
	

}