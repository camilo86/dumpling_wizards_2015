package deansList.overnightRobot.subsystems;

import deansList.overnightRobot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 
 * @author Camilo Gonzalez
 *
 */
public class DriveTrain extends Subsystem {
    
	private Talon leftDrive = new Talon(RobotMap.LEFT_DRIVE_MOTOR);
	private Talon rightDrive = new Talon(RobotMap.RIGHT_DRIVE_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setLeftPower(double pow) {
    	this.leftDrive.set(pow);
    }
    
    public void setRightPower(double pow) {
    	this.rightDrive.set(pow);
    }
    
    public void driveLR(double left, double right) {
    	setLeftPower(left);
    	setRightPower(right);
    }
}
