package frc.robot;
import frc.robot.*;

import java.util.stream.Node.Builder.OfInt;

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
        
        Shuffleboard.getTab("Live Window")
        .add("Xbox Y value",OI.controller1.getRawAxis(4))
        .withPosition(0,2)
        .withSize(2, 1)
        .withWidget("Number Bar");
        
       Shuffleboard.getTab("Live Window")
       .add("power usage", OI.pdp)
       .withPosition(0, 3)
       .withSize(3, 2)
       .withWidget("PDP");
        
       Shuffleboard.getTab("Live Window")
       .add("Drive train RPM",OI.rightFrontDriveMotor)
       .withPosition(9,4)
       .withSize(2,2)
       .withWidget("Dial");

       Shuffleboard.getTab("Live Window")
       .add("Pressure Switch",OI.pressureSwitch)
       .withPosition(9, 3)
       .withSize(2, 1)
       .withWidget("Toggle Button");

       /* Shuffleboard.getTab("Live Window")
        .add("Vision".OI.Vision)
        .withPosition(4,3)
        .withSize(4,3)
        .withWidget("");
        */
       /* Shuffleboard.getTab("Live Window")
        .add("Shift"OI.shiftSolenoid.get())
        .withPosition(9,2)
        .withSize(2,1)
        .withWidget("Toggle Button");
        */

       // SmartDashboard.putData("Right Encoder", OI.rightDriveEncoder);
       // SmartDashboard.putData("Left Encoder", OI.leftDriveEncoder);
        
    }
}
