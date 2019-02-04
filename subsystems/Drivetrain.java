package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Drivetrain {
  public Drivetrain() {}
  public static void shift(String direction) {
    switch(direction) {
      case "up":
        OI.shiftSolenoid.set(DoubleSolenoid.Value.kForward);      
      break;
      case "down":
        OI.shiftSolenoid.set(DoubleSolenoid.Value.kReverse);      
      break;
    }
  }
  public static void periodic() {
    OI.drive.arcadeDrive(-OI.controller1.getRawAxis(1), OI.controller1.getRawAxis(4));
  }
}