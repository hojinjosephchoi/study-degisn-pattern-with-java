package com.lattekafe.designpattern.observer.ver1;

// Observable
public class Button {
	
	private OnClickListener onClickListener;
	
	// Observable.notify
	public void click(){
		if(onClickListener != null){
			onClickListener.onClick(this);	
		}
	}

	// Observable.setObserver
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	// Observer
	public interface OnClickListener{
		// Observer.update
		public void onClick(Button button);
	}
}


