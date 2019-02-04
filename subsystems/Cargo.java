package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import frc.robot.OI;

public class Cargo {
  public Cargo() {}
  public static void actuateArm(String direction, double speed) {
  //TODO: Limit switches to stop arm at top and bottom
    switch(direction) {
      case "up":
        OI.cargoArmActuate.setInverted(false);
        OI.cargoArmActuate.set(ControlMode.PercentOutput, speed);
      break;
      case "down":
        OI.cargoArmActuate.setInverted(true);
        OI.cargoArmActuate.set(ControlMode.PercentOutput, speed);
      break;
    }
  }
  public static void stopArm() {
    OI.cargoArmActuate.set(ControlMode.PercentOutput, 0);
  }
  public static void actuateClaw(String direction) {
    //TODO: Limit switch to stop motors when ball is in the claw
    switch(direction) {
      case "in":
        OI.cargoClawLeft.setInverted(false);
        OI.cargoClawRight.setInverted(false);
        OI.cargoClawLeft.set(ControlMode.PercentOutput, 100);
        OI.cargoClawRight.set(ControlMode.PercentOutput, 100);
      break;
      case "out":
        OI.cargoClawLeft.setInverted(true);
        OI.cargoClawRight.setInverted(true);
        OI.cargoClawLeft.set(ControlMode.PercentOutput, 100);
        OI.cargoClawRight.set(ControlMode.PercentOutput, 100);
      break;
    }
  }
  public static void stopClaw() {
    OI.cargoClawLeft.set(ControlMode.PercentOutput, 0);
    OI.cargoClawRight.set(ControlMode.PercentOutput, 0);
  }
}