package frc.robot;


import frc.robot.OI;
public class Talonencode{
    public static void Init(){
    // set right motor group to read encoder val
        OI.rightCenterDriveMotor.configFactoryDefault();
        OI.rightBackDriveMotor.configFactoryDefault();
        OI.rightFrontDriveMotor.configFactoryDefault();
    // set value inverted
        OI.rightBackDriveMotor.setInverted(false);
        OI.rightFrontDriveMotor.setInverted(false);
        OI.rightCenterDriveMotor.setInverted(false);

    }
}