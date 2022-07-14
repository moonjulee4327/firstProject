package common;

public enum AdminMenu {
	HOME(0, "------------------------------------------------------\n"
    		+ "1.학생관리\t    2. 교수관리\t  3. 강의개설\n번호를 선택하세요>> "),
	STUDENT(1,"1. 학생조회\t2. 학생등록\t0. 이전메뉴\n번호를 선택하세요>>"),
	PROFESSOR(2,"1. 교수조회\t2. 교수등록\t0. 이전메뉴\n번호를 선택하세요>>"),
	LECTURE(3,"1. 강의조회\t2. 강의개설\t0. 이전메뉴\n번호를 선택하세요>>");
	
	private final int menu;
    private final String menuString;

    AdminMenu(int menu, String menuString) {
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
