package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BucketSubsystem;

public class BucketCommand extends CommandBase {
    private BucketSubsystem bucketSubsystem;
    private int bucketPose;
    public BucketCommand(BucketSubsystem bucketSubsystem,int bucketPose){
        super();
        this.bucketSubsystem = bucketSubsystem;
        this.bucketPose = bucketPose;
    }
    public void initialize(){

    }
    public void execute(){
    if (this.bucketPose == 0){
        bucketSubsystem.BucketIn();
    }
    if (this.bucketPose == 1){
        bucketSubsystem.BucketOut();
        }
    }
    public void end(boolean interrupted){
        this.bucketSubsystem.BucketOff();
        this.bucketPose = 3;
    }
    public boolean isFinished(){
        return false;
    }
}
