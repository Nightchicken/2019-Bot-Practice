package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LiftSubsystem;

public class LiftCommand extends CommandBase {
    private int direction;
    private LiftSubsystem lift;
    public LiftCommand(LiftSubsystem lift,int direction){
        super();
        this.lift = lift;
        addRequirements(this.lift);
        this.direction = direction;
    }
    public void initialize(){

    }
    public void execute(){
        if (this.direction == 1){
            lift.moveUp();
        }
        if (this.direction == 2){
            lift.moveDown();
        }
    }
    public void end(boolean interrupted){
        lift.off();
    }
    public boolean isFinished(){
        return false;
    }
}
