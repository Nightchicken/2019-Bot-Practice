package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

    private Spark frontLeftMotor = new Spark(3);
    private Spark backLeftMotor = new Spark(2);
    private Spark frontRightMotor = new Spark(0);
    private Spark backRightMotor = new Spark(1);

    private Encoder rightEncoder;
    private Encoder leftEncoder;

    private SpeedControllerGroup leftMotors = new SpeedControllerGroup(backLeftMotor,frontLeftMotor);
    private SpeedControllerGroup rightMotors = new SpeedControllerGroup(backRightMotor,frontRightMotor);

    public DriveSubsystem(){
        super();
        leftEncoder = new Encoder(2,3);
        rightEncoder = new Encoder(0,1);
    }

    public void setLeftMotors(double leftSpeed){
        leftMotors.set(leftSpeed);
    }
    public void setRightMotors(double rightSpeed){
        rightMotors.set(-rightSpeed);
    }
}
