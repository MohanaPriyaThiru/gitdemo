package newPro;

public class ConditionalStatement {
	
	public void ifst() {
	int mark =50;
	
	//if statement demo
	
	if(mark>=35) {
		
		System.out.println("The candidate is Pass");
		if(mark==50) {
			System.out.println("True");
		}
	}
	
	else {
		System.out.println("the candiate is Fail");
	}
	
	}
	public void elif() {
		
		char grade='K';
		
		if(grade=='A') {
			System.out.println("Ist class");
			
		}else if(grade=='A'+1){
			System.out.println("2nd Class");
			
		}
		else if(grade=='A'+2) {
			System.out.println("3rd tier");
		}else {
			System.out.println("last tier");
		}
			
	}
	public static void main(String[] args) {
		ConditionalStatement cs = new ConditionalStatement();
		//cs.ifst();
		cs.elif();
	}
}
