package com.github.bernabaris.dayofweek;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DayOfWeekApplicationTests {

	@Autowired
	private DayOfWeekService service;
	@Test
	public void testDayOfWeekIf(){
		assertEquals("Pazartesi", service.DayOfWeekIf(1));
		assertEquals("Salı", service.DayOfWeekIf(2));
		assertEquals("Çarşamba", service.DayOfWeekIf(3));
		assertEquals("Perşembe", service.DayOfWeekIf(4));
		assertEquals("Cuma", service.DayOfWeekIf(5));
		assertEquals("Cumartesi", service.DayOfWeekIf(6));
		assertEquals("Pazar", service.DayOfWeekIf(7));
		assertEquals("Hata", service.DayOfWeekIf(8));

	}

	@Test
	public void testDayOfWeekSwitch(){
		assertEquals("Pazartesi", service.DayOfWeekSwitch(1));
		assertEquals("Salı",service.DayOfWeekSwitch(2));
		assertEquals("Çarşamba",service.DayOfWeekSwitch(3));
		assertEquals("Perşembe",service.DayOfWeekSwitch(4));
		assertEquals("Cuma",service.DayOfWeekSwitch(5));
		assertEquals("Cumartesi",service.DayOfWeekSwitch(6));
		assertEquals("Pazar", service.DayOfWeekSwitch(7));
		assertEquals("Hata", service.DayOfWeekSwitch(8));
	}
}
