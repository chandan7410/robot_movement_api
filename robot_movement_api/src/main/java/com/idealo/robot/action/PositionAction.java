package com.idealo.robot.action;

import org.springframework.http.HttpStatus;

import com.idealo.robot.exception.RoboMoveException;
import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotAction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositionAction extends RobotAction {

	public static final Pattern pattern = Pattern.compile("^POSITION\\s(\\d)\\s(\\d)\\s(.*)$");

	@Override
	public void execute(String command, RobotPosition current) {
		Matcher matcher = pattern.matcher(command);
		if (matcher.find()) {
			int row = Integer.parseInt(matcher.group(1));
			int col = Integer.parseInt(matcher.group(2));
			String direction = matcher.group(3);
			if (row > 5 || col > 5 || row < 0 || col < 0) {
				throw new RoboMoveException("Index out of bound", HttpStatus.BAD_REQUEST);
			}
			current.setRow(row);
			current.setCol(col);
			current.setDirection(direction);
			setDirection(current, current.getDirection());
		}
	}
}
