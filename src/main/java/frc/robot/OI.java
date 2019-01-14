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
public class OI {
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(RobotMap.pdpCAN);
  public static Joystick controller = new Joystick(RobotMap.controllerPort);

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
}

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
