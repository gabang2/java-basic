package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "김가영");
		library[1] = new Book("태백산맥1", "김가영");
		library[2] = new Book("태백산맥1", "김가영");
		library[3] = new Book("태백산맥1", "김가영");
		library[4] = new Book("태백산맥1", "김가영");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		// System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("===============");
		
		for(Book book:copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		// OBject copy해보기
		System.out.println("===============");
		
		library[0].setAuthor("가방이");
		library[0].setTitle("가방이의 블로그");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("===============");
		
		for(Book book:copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		// 주소만 복사한 것임을 알 수 있음 - shallow copy(얕은 복사)
		// 갑을 복사하려면 깊은 복사를 해야함.
	}

}
