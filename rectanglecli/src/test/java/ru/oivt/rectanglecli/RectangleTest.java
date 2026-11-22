package ru.oivt.rectanglecli;
import org.junit.jupiter.api.Test;
import ru.oivt.rectanglecli.model.Rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
	
	@Test
	public void testArea() {
		Rectangle rect = new Rectangle(3,4);
		assertEquals(12.0,rect.area(),"Площадь должна быть 12");
	}
	
	@Test
	public void testPerimeter() {
		Rectangle rect = new Rectangle(3,4);
		assertEquals(14.0,rect.perimeter(),"Периметр должен быть 14");
	}
	
	@Test
	public void testDiagonal() {
		Rectangle rect = new Rectangle(3,4);
		assertEquals(5.0,rect.diagonal(),"Диагональ должна быть 5");
	}

	public RectangleTest() {
		// TODO Auto-generated constructor stub
	}

}
