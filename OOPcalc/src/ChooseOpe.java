public class ChooseOpe extends Plus{

	public ChooseOpe(int[] anArray) {
		super(anArray);
		// TODO Auto-generated constructor stub
	}

	public void chooseOp(int[]arr, String operator){
			switch(operator){
				case "+":
						Plus pl = new Plus(arr);
						break;
				case "-":
						minus min = new minus(arr);
						break;
				case "/":
						divine di = new divine(arr);
						break;
				case "*":
						times t1 = new times(arr);
						break;
			}
	}	
		
}
		
		
	



		
	
	

