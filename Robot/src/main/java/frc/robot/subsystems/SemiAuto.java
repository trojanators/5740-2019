/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;
import frc.robot.OI;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

/**
 * Add your docs here.
 */
public class SemiAuto {
  public static Integer TARGET_DISTANCE = 1000;
  public SemiAuto() {
  }

  public static void main(String[] args) {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("GRIP/myContoursReport");
    double[] xValues = table.getEntry("centerX").getValue().getDoubleArray(); 
    double[] yValues = table.getEntry("centerY").getValue().getDoubleArray();
    double distance = xValues[1] - xValues[0];
    if(xValues.length > 2 || yValues.length > 2) {
      System.out.println("Too many targets detected!");
    } else {
      while(distance < TARGET_DISTANCE) {
        OI.drive.arcadeDrive(0.5, 0);
      }
      OI.drive.arcadeDrive(0, 0);
      //**DUMP BALL OR RELEASE HATCH**
    }
  }
}
