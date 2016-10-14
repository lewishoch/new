package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DishDao;
import po.Dish;
import util.DBUtil;

public class DishDaoImpl implements DishDao {

	@Override
	public Dish loadDish(long dishUuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDish(Dish dish) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDish(long dishUuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Dish> findAllDishes(long merchantUuid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
