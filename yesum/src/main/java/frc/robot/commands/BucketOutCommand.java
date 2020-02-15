package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BucketSubsystem;

public class BucketOutCommand extends CommandBase {
    private BucketSubsystem bucketSubsystem;
    public BucketOutCommand(BucketSubsystem bucketSubsystem){
        super();
        addRequirements(bucketSubsystem);
        this.bucketSubsystem = bucketSubsystem;
    }
    public void initialize(){
        this.bucketSubsystem.BucketOut();
    }
    public void execute(){

    }
    public void end(boolean interrupted){
    }
    public boolean isFinished(){
        return true;
    }
}
