package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Vertical extends Command {
  public Vertical() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_drivetrain);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
	//   double x = Robot.m_oi.getX();
	  double y = Robot.m_oi.getY();
	  Robot.m_drivetrain.drive(y);
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  protected void end() {
  }
}
