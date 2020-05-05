package io.github.dnloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenweatherRestClientApplication {

    /**
     * <p>
     * Uncomment the initDefault() method to load the application's default
     * configuration and set the openweather API key to start using the client.
     * <p>
     * 
     * @see io.github.dnloop.controller.Setting#initDefault()
     * @see <a href="https://openweathermap.org/appid">OpenWeatherMap</a>
     */
    public static void main(String[] args) {
//	Setting.initDefault();
//	Setting.setApi("YOUR_API_KEY");
	SpringApplication.run(OpenweatherRestClientApplication.class, args);

    }

}
