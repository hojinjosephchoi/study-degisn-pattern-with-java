package com.lattekafe.designpattern.templatemethod.ver2;

import java.util.List;

public abstract class ReportGenerator {
	
	public String generate(List<Customer> customers){
		String report = "";
		
		List<Customer> selectedCustomers = getSelectedCustomers(customers);
		report += getHeader(selectedCustomers);
		
		for(Customer customer : selectedCustomers){
			report += getContent(customer);
		}
		
		report += getFooter(selectedCustomers);
		
		return report;
	}
	
	
	protected abstract List<Customer> getSelectedCustomers(List<Customer> customers);
	
	protected abstract String getHeader(List<Customer> customers);
	
	protected abstract String getContent(Customer customer);
	
	protected abstract String getFooter(List<Customer> customers);

}
