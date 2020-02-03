package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends CommandBase {
    private XboxController controller;
    private DriveSubsystem drive;
    public DriveCommand(XboxController controller,DriveSubsystem drive){
        super();
        addRequirements(drive);
        this.controller = controller;
        this.drive = drive;
    }
    public void initialize(){

    }
    public void execute(){
        this.drive.setLeftMotors(this.controller.getY(GenericHID.Hand.kLeft));
        this.drive.setRightMotors(this.controller.getY(GenericHID.Hand.kRight));
    }
    public void end(boolean interrupted){

    }
    public boolean isFinished(){
    return false;
    }
}
