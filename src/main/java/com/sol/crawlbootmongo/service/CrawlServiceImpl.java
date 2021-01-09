package com.sol.crawlbootmongo.service;

import com.sol.crawlbootmongo.domain.Crawl;
import com.sol.crawlbootmongo.repository.CrawlRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CrawlServiceImpl implements CrawlService {
    CrawlRepository crawlRepository;

    @Override
    public List<Crawl> getCrawlData() {
        List<Crawl> crawls = crawlRepository.findAll();
        return crawls;
    }
}
