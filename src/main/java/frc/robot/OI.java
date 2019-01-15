/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class OI {
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(RobotMap.pdpCAN);
  public static Joystick controller1 = new Joystick(RobotMap.controllerPort);

  public static WPI_TalonSRX leftFrontDriveMotor = new WPI_TalonSRX(RobotMap.leftFrontDrivePWM);
  public static WPI_TalonSRX leftCenterDriveMotor = new WPI_TalonSRX(RobotMap.leftCenterDrivePWM);
  public static WPI_TalonSRX leftBackDriveMotor = new WPI_TalonSRX(RobotMap.leftBackDrivePWM);
  public static WPI_VictorSPX rightFrontDriveMotor = new WPI_VictorSPX(RobotMap.rightFrontDrivePWM);
  public static WPI_TalonSRX rightCenterDriveMotor = new WPI_TalonSRX(RobotMap.rightCenterDrivePWM);
  public static WPI_TalonSRX rightBackDriveMotor = new WPI_TalonSRX(RobotMap.rightBackDrivePWM);

  public static SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup(leftFrontDriveMotor, leftCenterDriveMotor, leftBackDriveMotor);
  public static SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(rightFrontDriveMotor, rightCenterDriveMotor, rightBackDriveMotor);
  public static DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);

  public static Relay compressorSpike = new Relay(RobotMap.compressorSpikePort);
  public static DigitalInput pressureSwitch = new DigitalInput(RobotMap.pressureSwitchPort);
  public static DoubleSolenoid shiftSolenoid = new DoubleSolenoid(RobotMap.shiftSolenoidOne, RobotMap.shiftSolenoidTwo);

  
	public static Encoder leftDriveEncoder = new Encoder(RobotMap.leftDriveEncoderPortOne, RobotMap.leftDriveEncoderPortTwo);
  public static Encoder rightDriveEncoder = new Encoder(RobotMap.rightDriveEncoderPortOne, RobotMap.rightDriveEncoderPortTwo);
}