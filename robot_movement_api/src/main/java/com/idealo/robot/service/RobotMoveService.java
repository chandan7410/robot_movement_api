package com.idealo.robot.service;

import com.idealo.robot.model.RobotPosition;

public interface RobotMoveService {
	RobotPosition parseScript(String script);
}
