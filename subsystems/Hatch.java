package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Hatch {
  public Hatch() {}
  public static void tilt(String direction) {
    switch(direction) {
      case "forward":
        OI.hatchTiltSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
      case "back":
        OI.hatchTiltSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
    }
  }
  public static void actuate(String direction) {
    switch(direction) {
      case "open":
        OI.hatchActuateSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
      case "close":
        OI.hatchActuateSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
    }
  } 
}