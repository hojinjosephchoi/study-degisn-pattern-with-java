package com.lattekafe.designpattern.adapter;

public class AdapterImpl implements Adapter {
	

	@Override
	public float twiceOf(float f) {
		
//		return (float) Math.twoTime((double) f);
		return Math.doubled(Double.valueOf((double) f)).floatValue();
		
	}

	@Override
	public float halfOf(float f) {
		System.out.println("half 함수 호출");
		return (float) Math.half((double) f);
	}

}
