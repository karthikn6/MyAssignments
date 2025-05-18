package week1.day1;

import week1.day2.Library;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib= new Library();
		System.out.println(lib.LibraryBooks("New Book"));
		lib.issueBook();
	}

}
