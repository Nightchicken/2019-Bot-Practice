package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;


public class DriveAutoCommand extends CommandBase {
    private DriveSubsystem driveSubsystem;
    private Timer timer;
    private double seconds = 2;
    private double motorSpeed = .03;
    public DriveAutoCommand(DriveSubsystem driveSubsystem){
        super();
        addRequirements(driveSubsystem);
        this.driveSubsystem = driveSubsystem;
        this.timer = new Timer();
    }
    public void initialize(){
        this.timer.reset();
        this.timer.start();
    }
    public void execute(){
        this.driveSubsystem.setRightMotors(motorSpeed);
        this.driveSubsystem.setLeftMotors(motorSpeed);
    }
    public void end(boolean interrupted){
        this.driveSubsystem.setLeftMotors(0);
        this.driveSubsystem.setRightMotors(0);
    }
    public boolean isFinished(){
        return this.timer.get() > seconds;
    }
}
