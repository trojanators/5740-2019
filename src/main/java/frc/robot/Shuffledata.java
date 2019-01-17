package frc.robot;
import frc.robot.*;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Shuffledata {

    public static void Periodic(){
        
        Shuffleboard.getTab("Live Window")
        .add("Xbox X value",OI.controller1.getRawAxis(1))
        .withPosition(0, 1)
        .withSize(2, 1)
        .withWidget("Number Bar");
        // controoler y
        Shuffleboard.getTab("Live Window")
        .add("Xbox Y value",OI.controller1.getRawAxis(4))
        .withPosition(0,2)
        .withSize(2, 1)
        .withWidget("Number Bar");
        //power 
       Shuffleboard.getTab("Live Window")
       .add("power usage", OI.pdp)
       .withPosition(0, 3)
       .withSize(3, 2)
       .withWidget("PDP");
        // rpm with mag encoders 
       Shuffleboard.getTab("Live Window")
       .add("Drive train RPM",OI.rightFrontDriveMotor)
       .withPosition(9,4)
       .withSize(2,2)
       .withWidget("Dial");
// pressure switch
       Shuffleboard.getTab("Live Window")
       .add("Pressure Switch",OI.pressureSwitch)
       .withPosition(9, 3)
       .withSize(2, 1)
       .withWidget("Toggle Button");
       // camera position
       /* Shuffleboard.getTab("Live Window")
        .add("Vision".)
        .withPosition(4,3)
        .withSize(4,3)
        .withWidget("");
        */
        // shifter is active
       /* \\Shuffleboard.getTab("Live Window")
        .add("Shift"OI.shiftSolenoid.get())
        .withPosition(9,2)
        .withSize(2,1)
        .withWidget("Toggle Button");
      */  
       // SmartDashboard.putData("Right Encoder", OI.rightDriveEncoder);
       // SmartDashboard.putData("Left Encoder", OI.leftDriveEncoder);
        
    }
}
