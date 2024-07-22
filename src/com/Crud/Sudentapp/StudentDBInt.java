package com.Crud.Sudentapp;

public interface StudentDBInt {
     //Create
	public void create(Student s);
	//Showall
	public void showAll();
	//show by Id
	public void showbyID(int r);
	//update
	public void update(int r);
	//delete
	public void delete(int r);
}
