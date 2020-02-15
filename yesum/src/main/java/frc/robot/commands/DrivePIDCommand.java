package frc.robot.commands;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveSubsystem;

public class DrivePIDCommand extends CommandBase{
    private DriveSubsystem driveSubsystem;
    private PIDController pidController;
    private double kP = 0;
    private double kI = 0;
    private double kD = 0;
    public DrivePIDCommand(DriveSubsystem driveSubsystem){
        super();
        addRequirements(driveSubsystem);
        this.driveSubsystem = driveSubsystem;
        this.pidController = new PIDController(kP,kI,kD);
    }
    public void initialize(){

    }
    public void execute(){

    }
    public void end(boolean interrupted){

    }
    public boolean isFinished(){
        return false;
    }
}
