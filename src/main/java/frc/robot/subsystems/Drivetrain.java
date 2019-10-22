package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.VictorSRX;

public class Drivetrain extends Subsystem {
	VictorSPX lefty = new VictorSPX (0);
	VictorSPX righty = new VictorSPX (0);

	public void drive(double speedl, double speedr) {
		lefty.set(ControlMode.PercentOutput, speedl);
		righty.set(ControlMode.PercentOutput, speedr);
	}

	public void drive(double speedl) {
		drive(speedl, speedl);
	}


  	public void initDefaultCommand() {}
}
