package com.enigma.isma.kalkulator_mvn;

import java.util.Scanner;

import com.enigma.isma.kalkulator_mvn.services.KalkulatorService;
import com.enigma.isma.kalkulator_mvn.services.KalkulatorServiceImpl;

public class Menu {

	private KalkulatorService kalkulatorService;

	public void start() {
		this.kalkulatorService = new KalkulatorServiceImpl();

		Scanner scan = new Scanner(System.in);
		
		int menu;
		do {
			
		printMenu();

		System.out.println("Pilih menu: ");
		menu = scan.nextInt();
		System.out.println("Masukkan angka 1 : ");
		int numb1 = scan.nextInt();
		System.out.println("Masukkan angka 2 : ");
		int numb2 = scan.nextInt();

		if (menu==1) {
			int addResult = this.kalkulatorService.add(numb1, numb2);
			System.out.println(numb1 + " + " + numb2 + " = " + addResult);
		} else if (menu==2) {
			int substractResult = this.kalkulatorService.substract(numb1, numb2);
			System.out.println(numb1 + " - " + numb2 + " = " + substractResult);
		} else if (menu==3) {
			int multiplyResult = this.kalkulatorService.multiply(numb1, numb2);
			System.out.println(numb1 + " x " + numb2 + " = " + multiplyResult);
		} else if (menu==4) {
			Double divideResult = this.kalkulatorService.divide(1.0 * numb1, 1.0 * numb2);
			System.out.println(numb1 + " : " + numb2 + " = " + divideResult);
		}
		} while (menu==5);
	}

	public void printMenu() {
		System.out.println("=======Selamat Datang di Kalkulator======");
		System.out.println("1. Tambah");
		System.out.println("2. Kurang");
		System.out.println("3. Kali");
		System.out.println("4. Bagi");
		System.out.println("5. Exit");
	}

	public int inputAngka1(Scanner scan) {

		return 0;
	}

}
