package com.idealo.robot.model;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RobotPosition {

	private int row;

	private int col;

	private String direction;

	private int directionDegree;

}
