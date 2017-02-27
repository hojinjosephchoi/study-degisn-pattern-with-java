package com.lattekafe.designpattern.templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String str) {
		System.out.println("강화된 알고리즘을 이용한 디코딩");
		return str;
	}

	@Override
	protected boolean doAuthentication(String id, String pw) {
		System.out.println("아이디/암호확인 과정");
		return true;
	}

	@Override
	protected int doAuthorization(String userName) {
		System.out.println("권한 확인");
		// 서버에서 유저의 나이를 알 수 있다.
		// 시간을 확인하고 성인이 아닐 경우 10시가 지났다면 권한이 없는 것으로 한다.
		return 0;
	}

	@Override
	protected String doConnection(String info) {
		System.out.println("마지막 접속단계");
		return info;
	}

}
