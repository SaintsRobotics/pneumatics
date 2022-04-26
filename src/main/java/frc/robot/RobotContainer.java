// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.PneumaticReverse;
import frc.robot.commands.PneumaticsForward;
import frc.robot.commands.PneumaticsOff;
import frc.robot.commands.PneumaticsToggle;
import frc.robot.subsystems.PneumaticSubsytem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final PneumaticSubsytem m_PneumaticSubsystem = new PneumaticSubsytem();

  private final PneumaticsOff m_off = new PneumaticsOff(m_PneumaticSubsystem);
  private final PneumaticsForward m_forward = new PneumaticsForward(m_PneumaticSubsystem);
  private final PneumaticsToggle m_toggle = new PneumaticsToggle(m_PneumaticSubsystem);
  private final PneumaticReverse m_reverse = new PneumaticReverse(m_PneumaticSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
