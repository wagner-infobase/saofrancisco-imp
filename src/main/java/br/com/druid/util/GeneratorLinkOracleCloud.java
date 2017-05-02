package br.com.druid.util;

import java.net.MalformedURLException;
import java.net.URI;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class GeneratorLinkOracleCloud {
	
	private static final String URL = "https://a433004.storage.oraclecloud.com/v1";
	private static final String CONTAINER = "SF-SIB";
	private static final String NOME_INSTANCIA = "Storage";
	private static final String NOME_DOMINIO = "a433004";
	
	public static String returnLink(String fileName) throws MalformedURLException
	{
		StringBuilder uriDownload = new StringBuilder(URL).append("/").append(NOME_INSTANCIA).append("-").append(NOME_DOMINIO);
		uriDownload.append("/").append(CONTAINER);
		
		URI uri = ServletUriComponentsBuilder.fromHttpUrl(uriDownload.toString()).path("/{batchName}")
				.buildAndExpand(fileName).toUri();
		
		return uri.toURL().toString();
	}

}
