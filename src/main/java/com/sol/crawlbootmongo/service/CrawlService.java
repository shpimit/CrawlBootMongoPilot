package com.sol.crawlbootmongo.service;

import com.sol.crawlbootmongo.domain.Crawl;

import java.util.List;

public interface CrawlService {
    public List<Crawl> getCrawlData();
}
