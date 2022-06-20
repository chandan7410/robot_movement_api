package com.idealo.robot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.idealo.robot.action.LeftAction;
import com.idealo.robot.model.RobotPosition;

public class LeftActionTest {

	@Test
	public void testLeftToEast() {
		RobotPosition position = new RobotPosition(2, 0, "EAST", 90);
		LeftAction leftAction = new LeftAction();
		leftAction.execute("LEFT", position);
		Assertions.assertEquals("NORTH", position.getDirection());
	}

	@Test
	public void testLeftToWest() {
		RobotPosition position = new RobotPosition(2, 0, "WEST", 90);
		LeftAction leftAction = new LeftAction();
		leftAction.execute("LEFT", position);
		Assertions.assertEquals("SOUTH", position.getDirection());
	}

	@Test
	public void testLeftToSouth() {
		RobotPosition position = new RobotPosition(2, 0, "SOUTH", 90);
		LeftAction leftAction = new LeftAction();
		leftAction.execute("LEFT", position);
		Assertions.assertEquals("EAST", position.getDirection());
	}

	@Test
	public void testLeftToNorth() {
		RobotPosition position = new RobotPosition(2, 0, "NORTH", 90);
		LeftAction leftAction = new LeftAction();
		leftAction.execute("LEFT", position);
		Assertions.assertEquals("WEST", position.getDirection());
	}

}
