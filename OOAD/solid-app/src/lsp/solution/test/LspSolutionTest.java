package lsp.solution.test;

import lsp.solution.Rectangle;

public class LspSolutionTest {

	public static void main(String[] args) {
		
		shouldNotChangeHeight_IfWidthChange(new Rectangle(100, 50));
//		shouldNotChangeHeight_IfWidthChange(new Square(100));
	}

	public static void shouldNotChangeHeight_IfWidthChange(Rectangle r) {

		int before = r.getHeight();
		r.setWidth(r.getWidth() + 10);
		int after = r.getHeight();
		System.out.println((after == before));
		System.out.println(after);
		System.out.println(before);
	}
}
