package divergent_change.before;

public class FullRectanglePrinter extends RectanglePrinter {

	public FullRectanglePrinter(Rectangle r) {
		super(r);
	}

	@Override
	public void print() {
		int height = r.getHeight();
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < r.getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}