package com.atorres.nttdata.clientms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientMsApplication {
	/**.
	 * Funcion principal
	 * @param args arg
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientMsApplication.class, args);
	}

}
