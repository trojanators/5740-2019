package frc.robot;
import frc.robot.*;

import java.util.stream.Stream;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
public class Shuffledata {
//Displays all Data Vars Preprogramed to Display on Shuffleboard Dashboard
public static void Init(){
        Shuffleboard.selectTab("LiveWindow");
        Shuffleboard.getTab("LiveWindow")
        .add("Xbox X value",OI.controller1.getRawAxis(1))
        .withPosition(0, 1)
        .withSize(2, 1)
        .withWidget(BuiltInWidgets.kNumberBar);
        
// controoler y
        Shuffleboard.getTab("LiveWindow")
        .add("Xbox Y value",OI.controller1.getRawAxis(4))
        .withPosition(0,2)
        .withSize(2, 1)
        .withWidget(BuiltInWidgets.kNumberBar);
//power 
       Shuffleboard.getTab("LiveWindow")
       .add("power usage", OI.pdp)
       .withPosition(0, 3)
       .withSize(3, 2)
       .withWidget(BuiltInWidgets.kPowerDistributionPanel);
// rpm with mag encoders 
/*
       Shuffleboard.getTab("Test")
       .add("Drive train RPM",OI.rightFrontDriveMotor)
       .withPosition(9,4)
       .withSize(2,2)
       .withWidget(BuiltInWidgets.kDial);
       */
// pressure switch
       Shuffleboard.getTab("LiveWindow")
       .add("Pressure Switch",OI.pressureSwitch)
       .withPosition(9, 3)
       .withSize(2, 1)
       .withWidget(BuiltInWidgets.kBooleanBox);
// shifter is active
       Shuffleboard.getTab("LiveWindow")
        .add("Shifting",OI.shiftSolenoid)
        .withPosition(9,2)
        .withSize(2,1)
        .withWidget(BuiltInWidgets.kBooleanBox);
// graph of robot speed 
        Shuffleboard.getTab("LiveWindow")

        .add("Accelleration graph",OI.accelerometer)
        .withPosition(4, 1)
        .withSize(4, 2)
        .withWidget(BuiltInWidgets.kGraph);
// 3 point acceleromitor 
        Shuffleboard.getTab("LiveWindow")
        .add("axis acc",OI.accelerometer)
        .withPosition(9,1)
        .withSize(2,1)
        .withWidget(BuiltInWidgets.k3AxisAccelerometer);

// Adds Grip output to dashboard       
        Shuffleboard.getTab("LiveWindow")
        .add("camera","GRIP/myContoursReport/streams<=mjpg:http://10.57.40.105:1181/?action=stream" )
        .withPosition(4,3)
        .withSize(4,3)
        .withWidget(BuiltInWidgets.kCameraStream);
        Shuffleboard.update();
        }
}