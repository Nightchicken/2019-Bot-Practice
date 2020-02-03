package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LiftSubsystem extends SubsystemBase {
    Spark lift = new Spark(5);
    public LiftSubsystem(){
        super();
    }
    public void moveUp(){
        lift.set(-.7);
    }
    public void moveDown(){
        lift.set(.7);
    }
    public void off(){
        lift.set(0);
    }
}
