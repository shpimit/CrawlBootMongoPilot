package com.sol.crawlbootmongo.repository;

import com.sol.crawlbootmongo.domain.Crawl;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrawlRepository extends MongoRepository<Crawl, String> {
}
