package frc.robot;
import frc.robot.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Shuffledata {

    public static void Periodic(){
        SmartDashboard.putNumber("Xbox Y Value", OI.controller1.getRawAxis(1));
        SmartDashboard.putNumber("xbox X Value", OI.controller1.getRawAxis(4));
        SmartDashboard.putData("Pressure Switch", OI.pressureSwitch);
        SmartDashboard.putData("PDP", OI.pdp);
      //  SmartDashboard.putData("Right Encoder", OI.rightDriveEncoder);
      //  SmartDashboard.putData("Left Encoder", OI.leftDriveEncoder);
        
    }
}
