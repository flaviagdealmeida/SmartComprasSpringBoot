package org.smartcompras.dao;

import java.util.List;

import org.smartcompras.models.Marca;

import com.mongodb.WriteResult;

public interface Repository{
	
	public List<Marca> getAllObjects();

	public void saveObject(Marca marca);

	public Marca getObject(String id);

	public WriteResult updateObject(String id, String name);

	public void deleteObject(String id);

	public void createCollection();

	public void dropCollection();

	
}
