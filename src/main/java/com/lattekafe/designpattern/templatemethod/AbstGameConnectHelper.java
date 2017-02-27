package com.lattekafe.designpattern.templatemethod;

public abstract class AbstGameConnectHelper {

	// 외부에서는 호출하면 안되며, 하위클래스 재 정의를 위해 protected로 접근제한자 설정

	// 보안과정
	protected abstract String doSecurity(String str);

	// 인증과정
	protected abstract boolean doAuthentication(String id, String pw);

	// 권한과정
	protected abstract int doAuthorization(String userName);

	// 접속과정
	protected abstract String doConnection(String info);

	
	
	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {

		// 보안작업 -> 암호화된 문자열 decode
		String decodedInfo = doSecurity(encodedInfo);

		// 인증과정 -> 반환된 것을 가지고 아이디/암호 할당
		String id = "aaa";
		String password = "bbb";
		if (!doAuthentication(id, password)) {
			throw new Error("아이디, 암호 불일치");
		}

		// 권한과정 -> 인증에서 받아온 정보를
		String userName = "";
		int auth = doAuthorization(userName);
		switch (auth) {
		case -1:
			throw new Error("셧다운");
		case 0:
			System.out.println("게임매니저");
			break;
		case 1:
			System.out.println("유료회원");
			break;
		case 2:
			System.out.println("무료회원");
			break;
		case 3:
			System.out.println("권한없음");
			break;
		default:
			System.out.println("기타상황");
			break;
		}

		return doConnection(decodedInfo);
	}

}
