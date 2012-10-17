package com.andre.selenium.testes.brasileirao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.cglib.core.ClassInfo;

import org.apache.bcel.generic.ClassObserver;
import org.junit.Before;
import org.junit.Test;

import com.andre.selenium.SeleniumTeste;
import com.andre.selenium.SeleniumWebDriver;
import com.andre.selenium.telas.brasileirao.TelaTabelaBrasileirao;
import com.andre.selenium.telas.brasileirao.Times;
import com.andre.selenium.telas.cotacao.TelaCotacoesUOL;

public class CampeonatoBrasileiroTestes extends SeleniumTeste {

	TelaTabelaBrasileirao telaCampeonato;
	SeleniumWebDriver selenium;

	@Before
	public void prepararClassificacao() {
		this.selenium = new SeleniumWebDriver(driver);
		this.telaCampeonato = new TelaTabelaBrasileirao(selenium);
		this.telaCampeonato.abrir();
	}

	@Test
	public void testarClassificadosLibertadores() {
		System.out.println("Classificados para Libertadores");
		List<Times> classificados = telaCampeonato.getEstatisticasTimeLibertadores();
		for (int i = 0; i < classificados.size(); i++) {
			System.out.println(classificados.get(i));
		}
		System.out.println("");
	}

	@Test
	public void testarTimesRebaixadosSerieB() {
		System.out.println("Times que ser�o rebaixados para S�rie B?");
		List<Times> TimesRebaixados = telaCampeonato.getEstatisticasTimeRebaixados();
		for (int i = 0; i < TimesRebaixados.size(); i++) {
			System.out.println(TimesRebaixados.get(i));
		}
		System.out.println("");
	}
	
	@Test
	public void testarPalmeirasSeraRebaixadoSerieB() {
		System.out.println("O Palmeiras sera rebaixado para S�rie B?");
		List<Times> TimesRebaixados = telaCampeonato.getEstatisticasTimeRebaixados();
		boolean isPalmeirasRebaixado = false;
		for (int i = 0; i < TimesRebaixados.size(); i++) {
			if (TimesRebaixados.get(i).getTime().contains("Palmeiras")) {
				isPalmeirasRebaixado = true;
			}
		}
		
		if (isPalmeirasRebaixado) {
			System.out.println("Oh naum!! eita Tim�o que eh esse Palmeiras ser� rebaixado para a serie B e mesmo assim vai para a libertadores.");
		} else {
			System.out.println("Palmeiras eh foda escapou da zona de rebaixamento no finalzinho da rosca!");
		}
		
		System.out.println("");
	}
	
	@Test
	public void testarPosisaoCorinthians() {
		System.out.println("O Corinthians esta na posisao!");
		List<Times> times = telaCampeonato.getEstatisticasTimes();
		for (int i = 0; i < times.size(); i++) {
			if (times.get(i).getTime().contains("Corinthians")) {
				System.out.println("" + times.get(i));
			}
		}
		
		System.out.println("");
	}
	
	@Test
	public void testarCAPClassificadoSerieBParaPrimeiraDivisao() {
		System.out.println("Classificados para subir para primeira divisao.");
		List<Times> classificados = telaCampeonato.getClassificadosSerieBPrimeiraDivisao();
		boolean isCAP_Up = false;
		for (int i = 0; i < classificados.size(); i++) {
			System.out.println("" + classificados.get(i));
			if (classificados.get(i).getTime().contains("Atl�tico-PR")) {
				isCAP_Up = true;
			}
		}
		
		if (isCAP_Up) {
			System.out.println("ai SIM o Atl�tico-PR vai subir para primeira divisao!");
		} else {
			System.out.println("Oh naum!! Atl�tico-PR naum vai para a primeira divisao.");
		}
		System.out.println("");
	}
	
}
