package com.etek.fleetsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.Invoice;
import com.etek.fleetsystem.repositories.InvoiceRepository;


@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	//Return list of invoices
	public List<Invoice> getInvoices(){
		return invoiceRepository.findAll();
	}

	//SAve new invoice
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	//get by id
	public Optional<Invoice> findById(int id) {
		return invoiceRepository.findById(id);
	}

	public void delete(Integer id) {
		invoiceRepository.deleteById(id);
	}

}
