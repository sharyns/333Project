package mypackage;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import mypackage.Cash;
import mypackage.Computer;
import mypackage.CreditCard;
import mypackage.Driver;
import mypackage.Kiosk;
import mypackage.Order;
import mypackage.Payment;
import mypackage.Shops;
import mypackage.Store;
import mypackage.Ticket;

public class AllTests {
	
	
	@Test
	//test Cash class
	public void testCashPay() {
		Cash cash = new Cash();
		cash.pay(10.5);
		assertEquals(cash.toString().trim(), "10.5 paid with cash");
	}
	
	
	@Test
	//test Cash class
	public void testDriver() {
		Driver ourDriver = new Driver();
		String[] args = null;
		ourDriver.main(args);
		assertNotEquals(ourDriver, null);
	}
	
	

	@Test
	//test Computer class
	public void testCompOrderNo() {
		Computer computer = new Computer();
		int compOrder = computer.orderNo();
		assert(compOrder == 1);
	}

	@Test
	//test CreditCard class
	public void testCCPay() {
		CreditCard card = new CreditCard(112233);
		card.pay(22.7);
		assertEquals(card.toString().trim(), "22.7 paid with credit card number 112233");
	}
	
	@Test
	//test kiosk class
	public void testKiosk() {
		Kiosk kiosk = new Kiosk();
		assertNotEquals(kiosk, null);
	}
	
	@Test
	//test order class
	public void testOrder() {
		Order order = new Computer();
		assertEquals(order.orderNo(), 1);
	}
	
	@Test
	//test order class
	public void testPayment() {
		Payment method = new Cash();
		method.pay(11.11);
		assertNotEquals(method.toString().trim(), 10);
	}

	@Test
	//test Shops class
	public void testOrderFuncs() {
		Order testOrder = new Computer();
		Shops testShops = new Store();
		Payment cc = new CreditCard(224466);
		int num;
		testShops.setOrder(testOrder);
		num = testShops.orderNo();
		assertEquals(num, 1);
		testShops.setPayment(cc);
	}
	
	@Test
	public void testPaymentFuncs() {
		Shops testingShops = new Store();
		Payment cc = new CreditCard(224466);
		testingShops.setPayment(cc);
		testingShops.pay(12.99);
		assertEquals(testingShops.toString().trim(), "12.99 paid with credit card number 224466");
	}
	
	@Test 
	//test store class
	public void testChangePayment() {
		Store testStore = new Store();
		Shops testingShops = new Store();
		Payment cc = new Cash();
		testingShops.setPayment(cc);
		testStore.changePayment();
		assertNotEquals(testStore, testingShops);
	}

	
	@Test
	//test Ticket class
	public void testTicketOrderNo() {
		Ticket ticket = new Ticket();
		int i = 0;
		int j = 0;
		int ourOrder = ticket.orderNo();
		assert(ourOrder == 1);
	}

}
