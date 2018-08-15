package com.ssreddy.actuator.actuarotconfig;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMertics implements HealthIndicator {

	@Override
	public Health health() {

		return checkInternetConnection() == true ? Health.up().withDetail("200", "Active Connection").build()
				: Health.down().withDetail("500", "Internet Connection Problem").build();

	}

	private boolean checkInternetConnection() {

		boolean flag = false;
		try {
			URL url = new URL("https://google.com");
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

}
