package com.lrsi_status.db

import net.liftweb.mongodb._
import com.mongodb.{BasicDBObject, BasicDBObjectBuilder, DBObject, Mongo, MongoOptions, ServerAddress}
import net.liftweb.util.DefaultConnectionIdentifier;
import com.mongodb.{MongoClient, ServerAddress};

object DB {
  	def setup {
	}

	def isMongoRunning: Boolean = {
	    try {
	      true
	    }
	    catch {
	      case e => false
	    }
	  }
}
