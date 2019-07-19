package io.github.dnloop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.dnloop.units.Default;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenweatherRestClientApplicationTests {

    Logger log = LogManager.getLogger(OpenweatherRestClientApplicationTests.class);

    @Test
    public void contextLoads() {
	Default test = new Default();
	if (test.runTest())
	    log.info("-< Default Tests >- Succesful");
	else
	    log.warn("-< Default Tests >- Failed");
    }

}
