// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import Constants.PnematicsConstants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

public class PneumaticSubsytem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private Compressor pHCompressor;
  private DoubleSolenoid solenoid0;


  public PneumaticSubsytem() {
    pHCompressor = new Compressor(PnematicsConstants.kCompressorModuleID, PneumaticsModuleType.REVPH);
    solenoid0 = new DoubleSolenoid(PnematicsConstants.kSolenoidModuleType, PneumaticsModuleType.REVPH, PnematicsConstants.kIntakeLeftSolenoidPort, PnematicsConstants.kIntakeRightSolenoidPort);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putBoolean("enabled", pHCompressor.enabled());
    SmartDashboard.putBoolean("Pressure Switch", pHCompressor.getPressureSwitchValue());
    SmartDashboard.putNumber("Current", pHCompressor.getCurrent());
  }
  public void off() {
    solenoid0.set(kOff);
  }

  public void forward() {
    solenoid0.set(kForward);
  }

  public void reverse() {
    solenoid0.set(kReverse);
  }
  
  public void toggle() {
    solenoid0.toggle();
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
