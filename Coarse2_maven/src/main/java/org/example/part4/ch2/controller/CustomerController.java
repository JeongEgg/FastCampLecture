package org.example.part4.ch2;

import org.example.part4.ch2.controller.MedicalRecordController;
import org.example.part4.ch2.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers;
    // 진료기록을 관리하는 컨트롤러
    private MedicalRecordController recordController;

    public CustomerController(MedicalRecordController recordController){
        this.customers = new ArrayList<>();
        this.recordController = recordController;
    }

    // 고객정보를 등록하는 메서드
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    // 고객정보를 삭제하는 메서드(+반드시 해당고객의 진료기록도 함께 삭제)
    public void removeCustomer(String phoneNumber){
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getPhoneNumber().equals(phoneNumber)){
                customers.remove(i);
                // 해당고객의 진료기록 삭제
                recordController.removeMedicalRecord(phoneNumber);
                break;
            }
        }
    }
    // 고객등록 여부를 확인하는 메서드
    public Customer findCustomer(String phoneNumber){
        for (Customer customer : customers){
            if (customer.getPhoneNumber().equals(phoneNumber)){
                return customer;
            }
        }
        return null;
    }
    // 기존의 전화번호로 등록된 고객이 있는지를 확인하는 메서드(중복만 체크)
    public boolean isPhoneNumberExist(String phoenNumber){
        for (Customer customer : customers){
            if (customer.getPhoneNumber().equals(phoenNumber)){
                return true;
            }
        }
        return false;
    }
}
