package divergent_change.before;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(r.area(), 15);
		assertEquals(r.perimeter(), 16);
		
		System.out.println("");
		
		new BorderRectanglePrinter(r).print();
		System.out.println("");
		new FullRectanglePrinter(r).print();
	}

	private void assertEquals(int area, int i) {
		// TODO Auto-generated method stub
		
	}

}