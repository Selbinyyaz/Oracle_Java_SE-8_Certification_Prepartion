package questionV18;

public class S04 {

	public static void main(String[] args) {
		// Which code fragment, inserted at line n1, prints The Top element: 30?

		int[] stack = { 10, 20, 30 };
		int size = 3;
		int idx = 0;

		do {
			idx++;

		} while (idx < size - 1);

		System.out.println("top element: " + stack[idx]);// idx=2

	}

}
