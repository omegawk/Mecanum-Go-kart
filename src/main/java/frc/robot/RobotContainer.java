// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.MecanumDriveCommand;
import frc.robot.subsystems.MecanumDrivetrainsubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.drive.MecanumDrive;



public class RobotContainer {
  private final MecanumDrivetrainsubsystem m_MecanumDrivetrainsubsystem = new MecanumDrivetrainsubsystem();
  private Joystick m_stick;
  

  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    final MecanumDriveCommand m_robotDrive = new MecanumDriveCommand(m_MecanumDrivetrainsubsystem);
    m_stick = new Joystick(Constants.OperatorConstants.kDriverControllerPort);
    configureBindings();
    m_robotDrive.setDefaultCommand();
  
  }

  
  private void configureBindings() {
    
  }
}
