// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Constants.DrivetrainConstants;


public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DrivetrainSubsystem. */
  private WPI_VictorSPX m_frontLeft = new WPI_VictorSPX(DrivetrainConstants.frontLeftMID);
  private WPI_VictorSPX m_rearLeft = new WPI_VictorSPX(DrivetrainConstants.rearLeftMID);
  private WPI_VictorSPX m_frontRight = new WPI_VictorSPX(DrivetrainConstants.frontRightMID);
  private WPI_VictorSPX m_rearRight = new WPI_VictorSPX(DrivetrainConstants.rearRightMID);
  private MecanumDrive m_drive = new MecanumDrive(m_frontLeft, m_rearLeft, m_frontRight, m_rearRight);
  private XboxController m_controller = new XboxController(DrivetrainConstants.controller);
  
  public void setMecanumDrive(double ySpeed, double xSpeed, double zRotation)  {
  m_drive.driveCartesian(ySpeed, xSpeed,zRotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
