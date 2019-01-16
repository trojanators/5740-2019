package frc.robot;
import frc.robot.*;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Shuffledata {

    public static void Periodic(){
        Shuffleboard.getTab("Live_Window")
        .add("Xbox X value",OI.controller1.getRawAxis(1))
        .withPosition(2, 0)
        .withSize(2, 1)
        .withWidget("Number Bar");
        
        Shuffleboard.getTab("Live_Window")
        .add("Xbox Y value",OI.controller1.getRawAxis(4))
        .withPosition(3,0)
        .withSize(2, 1)
        .withWidget();
        
        SmartDashboard.putNumber("xbox y value", OI.controller1.getRawAxis(4));
        SmartDashboard.putData("pressure-switch", OI.pressureSwitch);


       // SmartDashboard.putData("Right Encoder", OI.rightDriveEncoder);
       // SmartDashboard.putData("Left Encoder", OI.leftDriveEncoder);
        
    }
}
