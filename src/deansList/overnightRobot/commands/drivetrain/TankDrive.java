package deansList.overnightRobot.commands.drivetrain;

import deansList.overnightRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDrive extends Command {

    public TankDrive() {
        requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.driveLR(Robot.oi.getLeftStickDrive(), Robot.oi.getRightStickDrive());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
