package frc.robot;
import frc.robot.*;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shuffledata {

    public static void Periodic(){
        SmartDashboard.putNumber("Xbox X value", OI.controller1.getRawAxis(1));
        SmartDashboard.putNumber("xbox y value", OI.controller1.getRawAxis(4));
        SmartDashboard.putData("pressure-switch", OI.pressureSwitch);
        
        
    }
}
