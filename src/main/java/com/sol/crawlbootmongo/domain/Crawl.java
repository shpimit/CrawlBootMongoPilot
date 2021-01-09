package com.sol.crawlbootmongo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "crawls")
public class Crawl {
    private String subtitle;
    private String content;
}
