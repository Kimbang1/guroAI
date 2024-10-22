package pack.io;

import java.io.File;
import java.util.Scanner;

public class FileMgr {

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\sample.txt");

		System.out.println("파일정보");
		System.out.println("===============");
		System.out.println("파일존재여부 : " + file.exists());

		System.out.println("파일명 :" + file.getName());
		System.out.println("파일크기 :" + file.length() + "Byte(s)");
		System.out.println("마지막 수정시간 :" + file.lastModified());

		System.out.println("파일삭제 실행");

		Scanner scanner = new Scanner(System.in);
		System.out.println("파일을 삭제하시겠습니까?(y/n) :");
		String chk = scanner.next();
		if (chk.equalsIgnoreCase("y")) {
			System.out.println("파일을 삭제합니다.");
			if (file.delete()) {
				System.out.println("삭제된 파일명 :  " + file.getName());
			} else {
				System.out.println("파일 삭제중 문제가 발생했습니다.");
				System.out.println("잠시 후 다시 실행해주세요.");
			}
		} else {
			System.out.println("사용자가 삭제를 취소하셨습니다.");
		}
			scanner.close();
	}
}
