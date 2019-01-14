/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Teleop {
    public static void Periodic(){
        OI.drive.arcadeDrive(-OI.controllearcadeDriver.getRawAxis(1), -OI.controller.getRawAxis(4));
        if(OI.pressureSwitch.get() == false) {
            OI.compressorSpike.set(Relay.Value.kOn);
          } else {
            OI.compressorSpike.set(Relay.Value.kOn);
          }
          if(OI.controller.getRawAxis(3) != 0) {
            OI.shiftSolenoid.set(DoubleSolenoid.Value.kForward);
            } else {
            OI.shiftSolenoid.set(DoubleSolenoid.Value.kReverse);
            }
    }
}
