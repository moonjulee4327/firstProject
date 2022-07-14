package common;

public enum StudentMenu {
	HOME(0, "------------------------------------------------------\n"
    		+ "1.수강신청\t    2. 전체성적확인\t  3. 수강내역조회\n번호를 선택하세요>> "),
	AUD(1,"1. 추가입력\t0.이전메뉴\n번호를 선택하세요>>");
	
	private final int menu;
    private final String menuString;

	StudentMenu(int menu, String menuString) {
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