package com.idealo.robot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idealo.robot.model.RobotPosition;
import com.idealo.robot.service.RobotMoveService;

import javax.validation.Valid;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(RobotController.ROOT_URL)
public class RobotController {

	public static final String ROOT_URL = "/";
	private final RobotMoveService robotMoveService;

	@GetMapping
	public String getIndexPage() {
		return "index";
	}

	@PostMapping
	public ResponseEntity<RobotPosition> generatePlanDto(@RequestBody @Valid final String moveScript) {
		return ResponseEntity.ok(robotMoveService.parseScript(moveScript));
	}
}
