package com.asbsolutionsusers.Customer;

public class CatalogItem {
    public int CustomerId;
    public String CustomerName;
    public Double AmountDue;
    public Double AmountPaidYTD;

    public CatalogItem(int customerId, String customerName, Double amountDue, Double amountPaidYTD) {
        CustomerId = customerId;
        CustomerName = customerName;
        AmountDue = amountDue;
        AmountPaidYTD = amountPaidYTD;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Double getAmountDue() {
        return AmountDue;
    }

    public void setAmountDue(Double amountDue) {
        AmountDue = amountDue;
    }

    public Double getAmountPaidYTD() {
        return AmountPaidYTD;
    }

    public void setAmountPaidYTD(Double amountPaidYTD) {
        AmountPaidYTD = amountPaidYTD;
    }
}
