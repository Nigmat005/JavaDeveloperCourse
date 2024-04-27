package com.cydeo.bootstrap;

import com.cydeo.entity.*;
import com.cydeo.enums.Status;
import com.cydeo.repository.*;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {
   private final PaymentRepository paymentRepository;
   private final MerchantRepository merchantRepository;
   private final CustomerRepository customerRepository;
   private final ItemRepository itemRepository;
   private final CartRepository cartRepository;

    @Autowired
    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Payment payment1 = new Payment(LocalDate.of(2022,4,19),new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("10000"),LocalDate.of(2022,4,24));

        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(LocalDate.of(2022,4,25),new BigDecimal("100000"), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"),new BigDecimal("5000"),LocalDate.of(2022,4,29));

        payment2.setPaymentDetail(paymentDetail2);
        List<Payment> paymentList= Arrays.asList(payment1,payment2);
        paymentRepository.saveAll(paymentList);


        // creating merchant
        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);
        List<Merchant>merchantList=Arrays.asList(merchant1);
        merchantRepository.saveAll(merchantList);


        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);
        paymentRepository.saveAll(paymentList);

        // creating customer
        Customer customer1 = new Customer("msmith","Mike","Smith","msmith@cydeo.com","VA");
        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);

        List<Customer>customerList=Arrays.asList(customer1);
        customerRepository.saveAll(customerList);

        paymentRepository.saveAll(paymentList);

        // creating items
        Item item1 = new Item("Milk","M01");
        Item item2 = new Item("Sugar","S01");
        Item item3 = new Item("Bread","B01");

        itemRepository.saveAll(Arrays.asList(item1,item2,item3));




        // creating carts
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.setItemList(Arrays.asList(item1,item2,item3));
        cart2.setItemList(Arrays.asList(item1,item2));

        cartRepository.saveAll( Arrays.asList(cart1,cart2));





    }
}
