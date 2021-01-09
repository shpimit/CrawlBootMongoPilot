package com.sol.crawlbootmongo.controller;

import com.sol.crawlbootmongo.domain.Crawl;
import com.sol.crawlbootmongo.service.CrawlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CrawlController {
    @Autowired
    private CrawlService crawlService;

    public CrawlController(CrawlService crawlService) {
        this.crawlService = crawlService;
    }

    @RequestMapping("/crawl")
    public String crawl(Model model) {
        List<Crawl> crawls = crawlService.getCrawlData();
        model.addAttribute("crawls", crawls);
        return "crawls";
    }
}
