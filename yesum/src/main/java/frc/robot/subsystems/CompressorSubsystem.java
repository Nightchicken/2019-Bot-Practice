package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CompressorSubsystem extends SubsystemBase {
    private Compressor comp;
    public CompressorSubsystem() {
        super();
        comp = new Compressor();
    }
}
