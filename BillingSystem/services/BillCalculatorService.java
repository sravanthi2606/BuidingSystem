package com.cg.BillingSystem.services;
import java.util.List;
import com.cg.BillingSystem.domain.Customer;
import com.cg.BillingSystem.domain.Item;
public interface BillCalculatorService {
	double calculateTotalPayableAmount(Customer customer, List<Item> items);
}
