package deansList.overnightRobot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * 
 * @author Camilo Gonzalez
 *
 */
public class OI {
    private final Joystick driverPad = new Joystick(RobotMap.DRIVERPAD_CONTROLLER);
    private final Joystick operatorPad = new Joystick(RobotMap.OPERATORPAD_CONTROLLER);
    
    
    public OI() {
    	
    }
    
    public double getLeftStickDrive() {
    	return -driverPad.getRawAxis(1);
    }
    
    public double getRightStickDrive() {
    	return -driverPad.getRawAxis(3);
    }
}

