/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.BucketCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.LiftCommand;
import frc.robot.subsystems.BucketSubsystem;
import frc.robot.subsystems.CompressorSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.LiftSubsystem;

import static edu.wpi.first.wpilibj.XboxController.Button.kBumperRight;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private DriveSubsystem driveSubsystem;
  private LiftSubsystem liftSubsystem;
  private CompressorSubsystem compressorSubsystem;
  private BucketSubsystem bucketSubsystem;
  private DriveCommand driveCommand;
  private LiftCommand liftCommandUp;
  private LiftCommand liftCommandDown;
  private BucketCommand bucketCommandIn;
  private BucketCommand bucketCommandOut;
  public XboxController controller = new XboxController(0);


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    this.compressorSubsystem = new CompressorSubsystem();
    this.driveSubsystem = new DriveSubsystem();
    this.liftSubsystem = new LiftSubsystem();
    this.bucketSubsystem = new BucketSubsystem();
    this.driveCommand = new DriveCommand(this.controller,this.driveSubsystem);
    this.bucketCommandIn = new BucketCommand(this.bucketSubsystem,0);
    this.bucketCommandOut = new BucketCommand(this.bucketSubsystem,1);
    this.liftCommandUp = new LiftCommand(this.liftSubsystem,1);
    this.liftCommandDown = new LiftCommand(this.liftSubsystem,2);
    this.driveSubsystem.setDefaultCommand(this.driveCommand);
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton rightBumper = new JoystickButton(controller, kBumperRight.value);
    rightBumper.whileHeld(this.liftCommandUp);
    JoystickButton leftBumper = new JoystickButton(controller,XboxController.Button.kBumperLeft.value);
    leftBumper.whileHeld(this.liftCommandDown);
    JoystickButton aButton = new JoystickButton(controller,XboxController.Button.kA.value);
    aButton.whenPressed(this.bucketCommandIn);
    JoystickButton xButton = new JoystickButton(controller,XboxController.Button.kX.value);
    xButton.whenPressed(this.bucketCommandOut);
  }



}
