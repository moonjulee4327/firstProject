package common;

public enum LoginMenu {
	HOME(1,"------------------------------------------------\n"
    		+ "\t\t학사관리시스템\n"
    		+ "------------------------------------------------\n"
    		+ "1.로그인\t\t0.프로그램 종료\n번호를 선택하세요: "),
	EXIT(0,"프로그램을 종료합니다");
	
	private final int menu;
    private final String menuString;

    LoginMenu(int menu, String menuString) {
    	this.menu = menu;
		this.menuString = menuString;
	}
	
    public int getMenu() {
		return menu;
	}
    
    public String getMenuString() {
        return menuString;
    }


	
}