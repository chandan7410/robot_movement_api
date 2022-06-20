package com.idealo.robot.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.idealo.robot.action.PositionAction;
import com.idealo.robot.exception.RoboMoveException;
import com.idealo.robot.model.RobotPosition;

public class PositionActionTest {

	@Test
	public void testInitPosition() {
		RobotPosition position = new RobotPosition(0, 0, "NORTH", 0);
		PositionAction positionAction = new PositionAction();
		positionAction.execute("POSITION 1 3 EAST", position);
		System.out.println(position.toString());
		Assertions.assertEquals(1, position.getRow());
		Assertions.assertEquals(3, position.getCol());
		Assertions.assertEquals("EAST", position.getDirection());
		Assertions.assertEquals(90, position.getDirectionDegree());
	}

	@Test
	public void testThrowException() {
		RobotPosition position = new RobotPosition(0, 0, "NORTH", 0);
		PositionAction positionAction = new PositionAction();
		Assertions.assertThrows(RoboMoveException.class, () -> positionAction.execute("POSITION 1 9 EAST", position));
	}
}
