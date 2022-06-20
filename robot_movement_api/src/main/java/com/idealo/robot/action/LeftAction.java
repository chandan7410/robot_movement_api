package com.idealo.robot.action;

import java.util.regex.Pattern;

import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotAction;

public class LeftAction extends RobotAction {

	public static final Pattern pattern = Pattern.compile("^LEFT$");

	@Override
	public void execute(String command, RobotPosition current) {
		setDirection(current, RobotAction.LEFT);
	}
}
