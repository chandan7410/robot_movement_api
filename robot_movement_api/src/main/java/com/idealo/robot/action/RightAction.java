package com.idealo.robot.action;

import java.util.regex.Pattern;

import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotAction;

public class RightAction extends RobotAction {

	public static final Pattern pattern = Pattern.compile("^RIGHT$");

	@Override
	public void execute(String command, RobotPosition current) {
		setDirection(current, RobotAction.RIGHT);
	}
}
