package com.microservices.chassis;

import static spark.Spark.get;

public class Example {

	public static void main(String[] args) {

		get("/", (req, res) -> {
			return "Hello! From microservices chassis";
		});

	}

}
