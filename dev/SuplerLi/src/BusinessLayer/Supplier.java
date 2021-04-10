package BusinessLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Supplier {
    private Integer id_supplier;
    private Long id_company;
    private String name;
    private List<String> contacts;
    private String paymentMethod;
    private String bankAccount;
    private  HashMap<Long, BusinessLayer.Product> products; // do we want hold the product himself? or the id?
    private BusinessLayer.Contract contract;



    public Supplier(Integer id_supplier, Long id_company, String name, List<String> contacts, String paymentMethod, String bankAccount) {
        this.id_supplier = id_supplier;
        this.id_company = id_company;
        this.name = name;
        this.contacts = contacts;
        this.paymentMethod = paymentMethod;
        this.bankAccount = bankAccount;
        this.contract= addContract();
        this.products=new HashMap<Long, BusinessLayer.Product>();
    }
    public HashMap<Long, Product> getProducts() {
        return products;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    protected void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    protected long getId_company() {
        return id_company;
    }

    protected void setId_company(long id_company) {
        this.id_company = id_company;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected List<String> getContacts() {
        return contacts;
    }

    protected void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    protected String getPaymentMethod() {
        return paymentMethod;
    }

    protected void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    protected String getBankAccount() {
        return bankAccount;
    }

    protected void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
/*
    public  void  SupplierMenu() {
        System.out.println("1) Add contact ");
        System.out.println("2) Show Contract");
        System.out.println("3) Show supplier" + id_supplier + " information");
        System.out.println("4) Show Contacts of supplier " + id_supplier);
        System.out.println("5) Back to main Menu");
        Scanner io = new Scanner(System.in);
        int op = io.nextInt();
        switch (op) {
            case 1: {
                Addcontact();
                break;
            }

            case 2: {
                showContract();
                break;
            }
            case 3: {
                System.out.println(this);
            }
            case 4: {
                showContacts();
            }
            case 5: {
                return;
            }


        }
    }
*/

 

    public BusinessLayer.Contract getContract() {
        return contract;
    }
      private BusinessLayer.Contract addContract(String days,Boolean NeedDelivery,HashMap<Integer, Integer> totalPriceDiscount){
        if( contract!=null) {
            System.out.println("this supplier already has a Contract");
            return contract;
        }
        else {
//            Scanner io = new Scanner(System.in);
//            BusinessLayer.Contract new_contract=null;
//            System.out.println("Insert Days of Supply:");
//            String  days = io.next();
//            System.out.println("Is needed delivery? ");
//            System.out.println("y/n");
//            String delivery = io.next();
//            boolean NeedDelivery;
//            NeedDelivery=delivery.compareTo("y")==0;
//            HashMap<Integer,Integer> totalPriceDiscount = new HashMap<Integer, Integer>();
//            System.out.println("Do you want enter discount?");
//            System.out.println("y/n");
//            String y_discount = io.next();
//            int amount;
//            int precent;
//            while (y_discount.compareTo("y")==0){
//                System.out.println("enter amount products: ");
//                amount= io.nextInt();
//                System.out.println("enter the discount percent for amount: "+ amount);
//                precent=io.nextInt();
//                totalPriceDiscount.put(amount,precent);
//                System.out.println("Do you want enter more discounts?");
//                System.out.println("y/n");
//                y_discount = io.next();
//                
//            }
            BusinessLayer.Contract new_contract = new BusinessLayer.Contract(days, NeedDelivery, totalPriceDiscount);
            return new_contract;
        }


    }


    public void Addcontact(String new_contact ) {
        contacts.add(new_contact);
    }

    public BusinessLayer.Contract showContract() {
        return contract;
    }
     public List<String> showContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Supplier : " +
                "id_supplier=" + id_supplier +
                ", id_company=" + id_company +
                ", name='" + name + '\'' +
                ", contacts=" + contacts +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", contract=" + contract +
                '}';
    }

}
