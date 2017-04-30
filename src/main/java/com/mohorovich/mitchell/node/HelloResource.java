package com.mohorovich.mitchell.node;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

/**
 * Dummy resource used by CoAP server.
 */
public class HelloResource extends CoapResource {

	private static final Logger logger = LogManager.getLogger(HelloResource.class);

	HelloResource(String name) {
		super(name);
	}
	public void handleGET(CoapExchange exchange) {
		System.out.println("test");
		logger.trace("Received GET...");
		exchange.respond("hello world");
	}
}