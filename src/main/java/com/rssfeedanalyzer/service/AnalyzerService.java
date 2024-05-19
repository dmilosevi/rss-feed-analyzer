package com.rssfeedanalyzer.service;

import com.rometools.rome.io.FeedException;
import com.rssfeedanalyzer.model.dto.TopicDTO;

import java.io.IOException;
import java.util.List;

public interface AnalyzerService {

    String analyseData(List<String> rssUrls) throws IOException, FeedException;

    List<TopicDTO> getTopThreeResults(String uniqueIdentifier);

}
