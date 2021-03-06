import java.util.List;
import java.util.Scanner;

import common.LoginMenu;
import common.ScannerUtil;
import lecture.LectureController;
import lecture.LectureVO;
import sign.SignController;
import sign.SignVO;
import student.StudentController;
import student.StudentVO;

public class Main {
	static StudentPortalView view = new StudentPortalView();
	static SignController signController = SignController.getInstance();
	static StudentController studentController = StudentController.getInstance();
	static LectureController lectureController = LectureController.getInstance();
	private static SignVO session = new SignVO();
	public static void main(String[] args) {
//		new Main().run();
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID: ");
		String id = scanner.nextLine();
		System.out.print("PW: ");
		String pw = scanner.nextLine();
		
		int result = signController.sign(new SignVO(id, pw));
		switch(result) {
		case 1:
			System.out.println("학생 로그인 성공");
			System.out.println("1.수강신청 2.전체성적확인 3.수강내역조회");
			int num = scanner.nextInt();
			if(num == 1) {
				System.out.println("1.수강 가능한 강의 조회 2.수강신청");
				int num1 = scanner.nextInt();
				if(num1 == 1) {
					//수강 가능한 강의 조회
					List<LectureVO> audSelects = lectureController.audSelect();
					for(LectureVO vo : audSelects) {
						System.out.println(vo);
					}
					
					
				}else if(num1 == 2) {
					//수강신청
				}
			}else if(num == 2) {
				
			}else if(num == 3) {
				
			}
			break;
		case 2:
			System.out.println("교수 로그인 성공");
			break;
		case 3:
			System.out.println("관리자 로그인 성공");
			//고친 것
			System.out.println("1.학생관리 2.교수관리 3.강의개설");
			int num1 = ScannerUtil.nextInt();
			if(num1 == 1) {
			System.out.println("1.학생조회 2.학생등록");
			int num2 = ScannerUtil.nextInt();
				if(num2 == 1) {
				List<StudentVO> students = studentController.selectStudent();
				for(StudentVO vo : students) {
					System.out.println(vo);
				}
				}else if(num2 ==2) {
					Scanner scanner2 = new Scanner(System.in);
					System.out.print("학번을 입력하시오 : ");
					int stuNo = scanner2.nextInt();
					System.out.print("이름을 입력하시오 : ");
					String stuNm = scanner2.next();
					System.out.print("이메일을 입력하시오 : ");
					String stuEm = scanner2.next();
					System.out.print("연락처를 입력하시오 : ");
					String stuPneNo= scanner2.next();
					System.out.print("학년을 입력하시오 : ");
					int stuGrd = scanner2.nextInt();
					System.out.print("학적을 입력하시오 : ");
					String stuAcdSt = scanner2.next();
					System.out.print("학과번호를 입력하시오 : ");
					String stuDep = scanner2.next();
					System.out.print("생년월일을 입력하시오 : ");
					String stuBir = scanner2.next();
					
					int studentInsert = studentController.insertStudent(new StudentVO(stuNo, stuNm, stuEm, stuPneNo, stuGrd, stuAcdSt, stuDep, stuBir));
					if(studentInsert == 1) {
						System.out.println("등록 성공~");
					}else {
						System.out.println("등록 실패!");
					}
					scanner2.close();
				}
			}else if(num1 == 2) {
				System.out.println("교수 드가자");
			}else if(num1 == 3) {
				System.out.println("1.강의 조회 2.강의개설");
				int num3 = scanner.nextInt();
				if(num3 == 1) {
					List<LectureVO> lectures = lectureController.selectLecture();
					for(LectureVO vo : lectures) {
						System.out.println(vo);
					}
				}else if(num3 == 2) {
					Scanner scanner3 = new Scanner(System.in);
					System.out.print("강의번호를 입력하시오 : ");
					int lecNo = scanner3.nextInt();
					System.out.print("연도를 입력하시오 : ");
					String yr = scanner3.next();
					System.out.print("학기를 입력하시오 : ");
					int sem = scanner3.nextInt();
					System.out.print("과목번호를 입력하시오 : ");
					String lecSub= scanner3.next();
					System.out.print("학과번호를 입력하시오 : ");
					String lecDep = scanner3.next();
					System.out.print("오전/오후 수업을 입력하시오 : ");
					String lecTm = scanner3.next();
					System.out.print("강의 개설 요일을 입력하시오 : ");
					String lecWk = scanner3.next();

					int LectureInsert = lectureController.LectureInsert(new LectureVO(lecNo, yr, sem, lecSub, lecDep, lecTm, lecWk));
					if(LectureInsert == 1) {
						System.out.println("등록 성공~");
					}else {
						System.out.println("등록 실패!");
					}
					scanner3.close();
				
				}
			}
			break;
			default:
				System.out.println("로그인 실패");
		}
			
	}
	
	
	public static void run() {
		Program:
		while(true) {
			LoginMenu login = LoginMenu.HOME;
			System.out.println(login.getMenuString());
			switch(login) {
			case HOME:
				view.sign(signController);
				break;
			case EXIT:
				break Program;
				default:
					System.out.println("유효하지 않은 입력입니다.");
					break;
			}
		}
	}

	public static SignVO getSession() {
		return session;
	}

	public static void setSession(SignVO session) {
		Main.session = session;
	}

}
