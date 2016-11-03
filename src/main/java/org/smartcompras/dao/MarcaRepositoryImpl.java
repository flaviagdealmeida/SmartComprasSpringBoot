package org.smartcompras.dao;

import java.util.List;

import org.smartcompras.models.Marca;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.WriteResult;

public class MarcaRepositoryImpl implements Repository {

	MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<Marca> getAllObjects() {
		return mongoTemplate.findAll(Marca.class);
	}

	@Override
	public void saveObject(Marca marca) {
		mongoTemplate.insert(marca);

	}

	@Override
	public Marca getObject(String id) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), Marca.class);
	}

	@Override
	public WriteResult updateObject(String id, String name) {
		return mongoTemplate.updateFirst(new Query(Criteria.where("id").is(id)), Update.update("name", name),
				Marca.class);
	}

	@Override
	public void deleteObject(String id) {
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Marca.class);
	}

	@Override
	public void createCollection() {
		if (!mongoTemplate.collectionExists(Marca.class)) {
			mongoTemplate.createCollection(Marca.class);
		}

	}

	@Override
	public void dropCollection() {
		if (mongoTemplate.collectionExists(Marca.class)) {
			mongoTemplate.dropCollection(Marca.class);
		}

	}

}
