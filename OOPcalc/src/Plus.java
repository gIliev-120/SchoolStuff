public class Plus implements Operations {
	private int[] arguments;
	int sum = 0;

	public Plus(int[] anArray) {
		this.arguments = anArray;
	}

	@Override
	public int exec() {
		int index = 0;
		for (int i : arguments) {
			if (index == 0) {
				sum = arguments[index];
			} else {
				sum += arguments[index];
				;
			}
			index++;
		}
		System.out.println(sum);
		return sum;
	}

}
