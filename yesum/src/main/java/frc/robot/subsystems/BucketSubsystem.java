package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BucketSubsystem extends SubsystemBase {
    private DoubleSolenoid bucketValve;
    public BucketSubsystem(){
     super();
     bucketValve = new DoubleSolenoid(1,2);
    }
    public void BucketIn(){
        this.bucketValve.set(DoubleSolenoid.Value.kReverse);
    }
    public void BucketOut() {
        this.bucketValve.set(DoubleSolenoid.Value.kForward);
    }
    public void BucketOff(){
        this.bucketValve.set(DoubleSolenoid.Value.kOff);
    }
}
