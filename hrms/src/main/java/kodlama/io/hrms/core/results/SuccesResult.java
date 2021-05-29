package kodlama.io.hrms.core.results;

public class SuccesResult extends Result{

	
	public SuccesResult(boolean success, String message) {
		super(true, message);
		
	}
	
	public SuccesResult(boolean success) {
		super(true);
		
	}

}
