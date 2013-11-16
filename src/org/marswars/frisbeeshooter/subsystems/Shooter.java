/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.frisbeeshooter.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.frisbeeshooter.RobotMap;

/**
 *
 * @author dquam
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Victor motor1 = new Victor(RobotMap.victorMotorController1);
            
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(double speed) {
        motor1.set(speed);
    }
}