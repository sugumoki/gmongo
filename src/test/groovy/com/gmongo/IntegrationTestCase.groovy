package com.gmongo

import com.mongodb.DBAddress
import com.mongodb.WriteConcern

class IntegrationTestCase extends GroovyTestCase {
	
	static DB_NAME = 'gmongo_test'
	
	def mongo
	
	void setUp() {
		mongo = new GMongo(new DBAddress('localhost', 27017, DB_NAME))
		mongo.setWriteConcern(WriteConcern.SAFE)
	}
	
	void testNothing() {}
}