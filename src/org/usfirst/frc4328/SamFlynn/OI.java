// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4328.SamFlynn;

import org.usfirst.frc4328.SamFlynn.commands.ActivateWinch;
import org.usfirst.frc4328.SamFlynn.commands.EjectPowerCube;
import org.usfirst.frc4328.SamFlynn.commands.IntakePowerCube;
import org.usfirst.frc4328.SamFlynn.commands.NormalDrive;
import org.usfirst.frc4328.SamFlynn.commands.ResetEncoders;
import org.usfirst.frc4328.SamFlynn.commands.ResetGyro;
import org.usfirst.frc4328.SamFlynn.commands.TestAutonomous;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * Kim was here This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driver1;
    public Joystick driver2;
    
    public JoystickButton suckCubeBoi;
    public JoystickButton driveNormalButton;
    public JoystickButton ejectButton;
    public JoystickButton resetButton;
    public JoystickButton backWinchButton;


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    	driver1 = new Joystick(0);
    	driver2 = new Joystick(1);
        
    	driveNormalButton = new JoystickButton(driver1, 1);
    	resetButton = new JoystickButton(driver1, 7);
    	
    	suckCubeBoi = new JoystickButton(driver2, 1);
    	ejectButton = new JoystickButton(driver2, 2);
    	backWinchButton = new JoystickButton(driver2, 11);
    	
    	driveNormalButton.whileHeld(new NormalDrive());
    	suckCubeBoi.whileHeld(new IntakePowerCube());
    	ejectButton.whileHeld(new EjectPowerCube());
    	resetButton.whileHeld(new ResetGyro());
    	
    	backWinchButton.whileHeld(new ActivateWinch());
    	

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new TestAutonomous());
        SmartDashboard.putData("Reset Encoders", new ResetEncoders());
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriver1() {
        return driver1;
    }

    public Joystick getDriver2() {
        return driver2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

