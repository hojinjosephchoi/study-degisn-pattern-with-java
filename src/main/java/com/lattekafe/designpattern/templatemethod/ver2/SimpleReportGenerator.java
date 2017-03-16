package com.lattekafe.designpattern.templatemethod.ver2;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {

	@Override
	protected List<Customer> getSelectedCustomers(List<Customer> customers) {
		return customers;
	}

	@Override
	protected String getHeader(List<Customer> customers) {
		return String.format("고객 수 : %d명\n", customers.size());
	}

	@Override
	protected String getContent(Customer customer) {
		return String.format("%s: %d\n", customer.getName(), customer.getPoint());
	}

	@Override
	protected String getFooter(List<Customer> customers) {
		return "";
	}

}
