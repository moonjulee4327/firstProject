import common.ScannerUtil;
import sign.SignController;
import sign.SignVO;

public class StudentPortalView {
	
	
	public void sign(SignController signController) {
		
		System.out.print("ID: ");
		String id = ScannerUtil.nextLine();
		System.out.print("PW: ");
		String pw = ScannerUtil.nextLine();
		int division = signController.sign(new SignVO());
		System.out.println(division);
		switch(division) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		
			
		}
		
	}
	
}
