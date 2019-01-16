package frc.robot;
import frc.robot.*;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Shuffledata {

    public static void Periodic(){
        Shuffleboard.getTab("Live_Window")
        .add("Xbox X value",OI.controller1.getRawAxis(1))
        .withPosition(0, 1)
        .withSize(2, 1)
        .withWidget("Number Bar");
        
        Shuffleboard.getTab("Live_Window")
        .add("Xbox Y value",OI.controller1.getRawAxis(4))
        .withPosition(0,2)
        .withSize(2, 1)
        .withWidget("Number Bar");
        
       Shuffleboard.getTab("Live_Window")
       .add("power usage", OI.pdp)
       .withPosition(0, 3)
       .withSize(3, 2)
       .withWidget("PDP");
        
       
        SmartDashboard.putData("pressure-switch", OI.pressureSwitch);


       // SmartDashboard.putData("Right Encoder", OI.rightDriveEncoder);
       // SmartDashboard.putData("Left Encoder", OI.leftDriveEncoder);
        
    }
}
