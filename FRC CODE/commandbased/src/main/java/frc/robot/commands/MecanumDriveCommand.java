// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;
import java.util.function.Supplier;
import frc.robot.Constants.DrivetrainConstants;

public class MecanumDriveCommand extends CommandBase {
  /** Creates a new MecanumDriveCommand. */
  private DrivetrainSubsystem driveSub;
  private Supplier<Double> xSpeed, ySpeed, zRotation;
  public MecanumDriveCommand(DrivetrainSubsystem dsub, Supplier straight, Supplier strafe, Supplier turn) {
    // Use addRequirements() here to declare subsystem dependencies.
  driveSub = dsub;
  ySpeed = straight;
  xSpeed = strafe;
  zRotation = turn;
  addRequirements(driveSub);
  }
    
    // Use addRequirements() here to declare subsystem dependencies.
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveSub.setMecanumDrive(ySpeed.get(), xSpeed.get(), zRotation.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
