package com.lattekafe.designpattern.templatemethod.ver2;

import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

	@Override
	protected List<Customer> getSelectedCustomers(List<Customer> customers) {
		List<Customer> selectedCustomers = new ArrayList<>();
		for(Customer customer : customers){
			if(customer.getPoint() >= 100){
				selectedCustomers.add(customer);
			}
		}
		return selectedCustomers;
	}

	@Override
	protected String getHeader(List<Customer> customers) {
		return String.format("고객 수 : %d명 입니다.\n", customers.size());
	}

	@Override
	protected String getContent(Customer customer) {
		return String.format("%d : %s\n", customer.getPoint(), customer.getName());
	}

	@Override
	protected String getFooter(List<Customer> customers) {
		int total = 0;
		for(Customer customer : customers){
			total += customer.getPoint();
		}
		return String.format("점수 합계 : %d", total);
	}

}
