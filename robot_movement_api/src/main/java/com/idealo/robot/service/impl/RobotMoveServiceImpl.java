package com.idealo.robot.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.idealo.robot.exception.RoboMoveException;
import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.ActionManager;
import com.idealo.robot.service.RobotAction;
import com.idealo.robot.service.RobotMoveService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

@Slf4j
@Service
@RequiredArgsConstructor
public class RobotMoveServiceImpl implements RobotMoveService {

	private final ActionManager actionManager;

	@Override
	public RobotPosition parseScript(final String script) {
		log.info("parsing script");
		RobotPosition current = new RobotPosition(0, 0, RobotAction.NORTH, 0);
		try (BufferedReader reader = new BufferedReader(new StringReader(script))) {
			String line = reader.readLine();
			while (line != null) {
				actionManager.manage(line, current);
				line = reader.readLine();
			}
		} catch (IOException exc) {
			log.error("Error on reading payload");
			throw new RoboMoveException("Error while reading script", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		log.info("Final position: " + current.toString());
		return current;
	}
}
