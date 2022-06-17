package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.Bill;

public interface BillService {

	List<Bill> getListBills();
	
	void createBill(Bill bill);

	Bill getBillById(int id);

	void updateBill(Bill bill);

	void deleteBill(int id);

}
