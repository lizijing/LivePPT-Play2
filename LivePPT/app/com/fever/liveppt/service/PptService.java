package com.fever.liveppt.service;

import java.io.InputStream;

import org.codehaus.jackson.JsonNode;

public interface PptService {

	public byte[] getPptPage(Long pptId, Long pageId);

	public void updatePptConvertedStatus(JsonNode messageJson);

}