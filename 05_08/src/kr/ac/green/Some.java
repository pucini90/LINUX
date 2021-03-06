package kr.ac.green;

import java.util.Scanner;

/*
 * ctrl + d : 줄삭제
 * ctrl + shift + o : 자동임포트
 * alt + shift + s -> c : 기본생성자
 * alt + shift + s -> o : 파라미터 처리 생성자
 * alt + shift + s -> r : getter / setter 생성
 * alt + shift + s -> s : toString 생성
 * ctrl + shift + f : 자동줄맞춤
 * alt + shift + t -> n : rename
 * ctrl + f6 : 에디트창 선택
 */
public class Some {
	public String str2 = "zzz";
	String str = "abc";
	private int num;
	private String title;
	private boolean ok;
	private Scanner scan;

	public Some() {
		super();
	}

	public Some(int num, String title, boolean ok) {
		super();
		this.num = num;
		this.title = title;
		this.ok = ok;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	@Override
	public String toString() {
		return "Some [num=" + num + ", title=" + title + ", ok=" + ok + "]";
	}

}
