import java.util.Scanner;

public class phoneBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phoneBook mPhoneBook = new phoneBook();

		int count = 0;
		int input;
		String[] name = new String[50];
		String[] number = new String[50];
		

		mPhoneBook.read();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("1: add");
		System.out.println("2: search");
		System.out.println("3: update");
		System.out.println("4: print");
		System.out.println("1~4번만 선택");		
		System.out.print("선택한번호는:  ");
		input = scanner.nextInt();
		scanner.nextLine();

		switch(input){
		case 1:
			mPhoneBook.add();
			break;
		case 2:
			mPhoneBook.search();
			break;
		case 4:
			mPhoneBook.print();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;

		}
		
		scanner.close();

	}

}
