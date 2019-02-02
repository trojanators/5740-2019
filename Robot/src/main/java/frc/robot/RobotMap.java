/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int pdpCAN = 6;
  public static int controllerPort = 0;

  public static int leftFrontDrivePWM = 0;
  public static int leftCenterDrivePWM = 1;
  public static int leftBackDrivePWM = 2;
  public static int rightFrontDrivePWM = 3;
  public static int rightCenterDrivePWM = 4;
  public static int rightBackDrivePWM = 5;

  public static int compressorSpikePort = 0;
  public static int pressureSwitchPort = 0;
  public static int shiftSolenoidOne = 1;
  public static int shiftSolenoidTwo = 2;
  
  public static final Integer leftDriveEncoderPortOne = 0;
	public static final Integer leftDriveEncoderPortTwo = 1;
	public static final Integer rightDriveEncoderPortOne = 2;
  public static final Integer rightDriveEncoderPortTwo = 3;
}

