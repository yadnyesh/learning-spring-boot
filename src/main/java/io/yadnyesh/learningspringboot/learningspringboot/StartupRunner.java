package io.yadnyesh.learningspringboot.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@Component
public class StartupRunner implements CommandLineRunner {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
//	@Autowired
//	private BookRepository bookRepository;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Welcome to the Book Catalog System!");
		logger.info("DataSource: " + dataSource.toString());
		
	}
	
//	@Scheduled(initialDelay = 1000, fixedRate = 10000)
//	public void run() {
//		logger.info("Number of books: " + bookRepository.count());
//	}

}