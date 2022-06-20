package com.idealo.robot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.idealo.robot.action.ForwardAction;
import com.idealo.robot.exception.RoboMoveException;
import com.idealo.robot.model.RobotPosition;

public class ForwardActionTest {

	@Test
	public void testForwardActionToEast() {
		RobotPosition position = new RobotPosition(2, 0, "EAST", 90);
		ForwardAction forwardAction = new ForwardAction();
		forwardAction.execute("FORWARD 3", position);
		Assertions.assertEquals(3, position.getCol());
	}

	@Test
	public void testForwardActionToWest() {
		RobotPosition position = new RobotPosition(2, 4, "WEST", 90);
		ForwardAction forwardAction = new ForwardAction();
		forwardAction.execute("FORWARD 2", position);
		Assertions.assertEquals(2, position.getCol());
	}

	@Test
	public void testForwardActionToNorth() {
		RobotPosition position = new RobotPosition(4, 4, "NORTH", 90);
		ForwardAction forwardAction = new ForwardAction();
		forwardAction.execute("FORWARD 4", position);
		Assertions.assertEquals(0, position.getRow());
	}

	@Test
	public void testForwardActionToSouth() {
		RobotPosition position = new RobotPosition(3, 4, "SOUTH", 90);
		ForwardAction forwardAction = new ForwardAction();
		forwardAction.execute("FORWARD 2", position);
		Assertions.assertEquals(5, position.getRow());
	}

	@Test
	public void testThrowException() {
		RobotPosition position = new RobotPosition(3, 4, "SOUTH", 90);
		ForwardAction forwardAction = new ForwardAction();

		Assertions.assertThrows(RoboMoveException.class, () -> {
			forwardAction.execute("FORWARD 5", position);
		});
	}
}
