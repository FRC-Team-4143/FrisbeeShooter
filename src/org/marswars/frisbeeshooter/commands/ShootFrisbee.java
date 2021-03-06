/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.frisbeeshooter.commands;

/**
 *
 * @author gardnjw
 */
public class ShootFrisbee extends CommandBase {
    
    public ShootFrisbee() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooter.shoot(Math.abs((oi.xbox.getThrottle())));
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        shooter.shoot(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}