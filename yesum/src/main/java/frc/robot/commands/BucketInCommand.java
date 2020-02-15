package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BucketSubsystem;

public class BucketInCommand extends CommandBase {
    private BucketSubsystem bucketSubsystem;
    public BucketInCommand(BucketSubsystem bucketSubsystem){
        super();
        addRequirements(bucketSubsystem);
        this.bucketSubsystem = bucketSubsystem;
    }
    public void initialize(){
        this.bucketSubsystem.BucketIn();
    }
    public void execute(){

    }
    public void end(boolean interrupted){
    }
    public boolean isFinished(){
        return true;
    }
}
