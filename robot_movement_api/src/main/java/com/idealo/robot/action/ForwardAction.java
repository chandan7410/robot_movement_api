package com.idealo.robot.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotAction;

public class ForwardAction extends RobotAction {
	public static final Pattern pattern = Pattern.compile("^FORWARD\\s(\\d)$");

	@Override
	public void execute(String command, RobotPosition current) {
		Matcher matcher = pattern.matcher(command);
		if (matcher.find()) {
			int step = Integer.parseInt(matcher.group(1));
			setMove(current, step);
		}
	}
}
