package com.idealo.robot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.idealo.robot.action.RightAction;
import com.idealo.robot.model.RobotPosition;

public class RightActionTest {

	@Test
	public void testToNorth() {
		RobotPosition position = new RobotPosition(2, 0, "NORTH", 90);
		RightAction rightAction = new RightAction();
		rightAction.execute("RIGHT", position);
		Assertions.assertEquals("EAST", position.getDirection());
	}

	@Test
	public void testToEast() {
		RobotPosition position = new RobotPosition(2, 0, "EAST", 90);
		RightAction rightAction = new RightAction();
		rightAction.execute("RIGHT", position);
		Assertions.assertEquals("SOUTH", position.getDirection());
	}

	@Test
	public void testToWest() {
		RobotPosition position = new RobotPosition(2, 0, "WEST", 90);
		RightAction rightAction = new RightAction();
		rightAction.execute("RIGHT", position);
		Assertions.assertEquals("NORTH", position.getDirection());
	}

	@Test
	public void testToSouth() {
		RobotPosition position = new RobotPosition(2, 0, "SOUTH", 90);
		RightAction rightAction = new RightAction();
		rightAction.execute("RIGHT", position);
		Assertions.assertEquals("WEST", position.getDirection());
	}

}
