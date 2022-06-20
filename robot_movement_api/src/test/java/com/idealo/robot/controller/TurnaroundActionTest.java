package com.idealo.robot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.idealo.robot.action.TurnaroundAction;
import com.idealo.robot.model.RobotPosition;

public class TurnaroundActionTest {

	@Test
	public void testToNorth() {
		RobotPosition position = new RobotPosition(2, 0, "NORTH", 90);
		TurnaroundAction turnaroundAction = new TurnaroundAction();
		turnaroundAction.execute("TURNAROUND", position);
		Assertions.assertEquals("SOUTH", position.getDirection());
	}

	@Test
	public void testToEast() {
		RobotPosition position = new RobotPosition(2, 0, "EAST", 90);
		TurnaroundAction turnaroundAction = new TurnaroundAction();
		turnaroundAction.execute("TURNAROUND", position);
		Assertions.assertEquals("WEST", position.getDirection());
	}

	@Test
	public void testToWest() {
		RobotPosition position = new RobotPosition(2, 0, "WEST", 90);
		TurnaroundAction turnaroundAction = new TurnaroundAction();
		turnaroundAction.execute("TURNAROUND", position);
		Assertions.assertEquals("EAST", position.getDirection());
	}

	@Test
	public void testToSouth() {
		RobotPosition position = new RobotPosition(2, 0, "NORTH", 90);
		TurnaroundAction turnaroundAction = new TurnaroundAction();
		turnaroundAction.execute("TURNAROUND", position);
		Assertions.assertEquals("SOUTH", position.getDirection());
	}

}
