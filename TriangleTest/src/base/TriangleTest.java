package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

	public class TriangleTest {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void TestTruegetArea() {
			Triangle t=new Triangle(3, 4, 5);
			assertTrue(t.getArea() == 6);
			
		}
		public void TestFalsegetArea() {
			Triangle t=new Triangle(3, 3, 5);
			assertFalse(t.getArea() == 6);
			
		}
		public void TestTrueGetPerimeter(){
			Triangle t = new Triangle(2,2,2);
			assertTrue(t.getPerimeter()== 6);
		}
		public void TestFalseGetPerimeter(){
			Triangle t = new Triangle(1,2,2);
			assertTrue(t.getPerimeter()== 6);
		}
		public void TestTruegetArea2() {
			Triangle t = new Triangle(10, 8, 6);
			assertTrue(t.getArea()==24);
		}
		public void TestFalsegetArea2() {
			Triangle t = new Triangle(2, 8, 6);
			assertTrue(t.getArea()==24);
		}
		public void TestTrueGetPerimeter2(){
			Triangle t = new Triangle(19,34,20);
			assertTrue(t.getPerimeter() == 73);
		}
		public void TestFalseGetPerimeter2(){
			Triangle t = new Triangle(22,34,20);
			assertTrue(t.getPerimeter() == 73);
		}
}