package com.idealo.robot.action;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Pattern;

import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotAction;

@Slf4j
public class WaitAction extends RobotAction {

	public static final Pattern pattern = Pattern.compile("^WAIT$");

	@Override
	public void execute(String command, RobotPosition current) {
		log.info("do nothing, just wait and relax");
	}
}
