package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItinerary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;

	private SearchHotel sh;
	private SelectHotel sl;
	private BookAHotel bh;
	private BookItinerary bi;
	private HomePage hp;

	public PageObjectManager(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSl() {
		sl = new SelectHotel(driver);
		return sl;
	}

	public BookAHotel getBh() {
		bh = new BookAHotel(driver);
		return bh;
	}

	public BookItinerary getBi() {
		bi = new BookItinerary(driver);
		return bi;
	}

}
