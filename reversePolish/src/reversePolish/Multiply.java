package reversePolish;

public class Multiply implements Operation {
	private int[] arguments;
	int result;
	public Multiply(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arguments=arr;
	}

	@Override
	public int execute() {
		// TODO Auto-generated method stub

		for(int index=0;index<arguments.length;index++){
			if (index == 0) {
				result = arguments[index];
			}else {
				result *= arguments[index];
			}
		}
		System.out.println("[Multi..]The result is"+result);
		return result;
	}

}
