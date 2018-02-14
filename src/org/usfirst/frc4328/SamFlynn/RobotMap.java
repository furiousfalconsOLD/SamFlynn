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

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Kim was also here boiii The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static SpeedController driveTrainLeft;
    public static SpeedController driveTrainRight;
    
    public static DifferentialDrive driveTrain;
    
    public static SpeedController frontElevator;
    public static SpeedController backElevator;
    
    public static SpeedController squeezeServo;
    public static SpeedController inclineServoLeft;
    public static SpeedController inclineServoRight;
    
    public static SpeedController cubeIntake;
    
    public static Ultrasonic ultrasonic;
    
    public static Encoder driveEncoder;
   
    public static Servo cameraServo;
    
    public static AnalogGyro gyro;
    
    public static DigitalInput frontTrigger;
    public static DigitalInput frontTop;
    public static DigitalInput backTrigger;
    public static DigitalInput backTop;
    public static DigitalInput cubeLimit;
    
    @SuppressWarnings("deprecation")
	public static void init() {
    	
    	//PWM
        driveTrainLeft = new Spark(0);
        driveTrainLeft.setInverted(false);
        
        driveTrainRight = new Spark(1);
        driveTrainRight.setInverted(false);
        
        driveTrain = new DifferentialDrive(driveTrainLeft, driveTrainRight);
        
        driveTrain.setSafetyEnabled(false);
        driveTrain.setExpiration(0.1);
        driveTrain.setMaxOutput(1.0);
        
        backElevator = new Spark(2);
        
        cubeIntake = new Spark(3);
        
        frontElevator = new Spark(4);
        
        squeezeServo = new Spark(5);
        inclineServoLeft = new Spark(6);
        inclineServoLeft = new Spark(7);
        
        cameraServo = new Servo(8);
        
        //DIO
        frontTrigger = new DigitalInput(1);
        frontTop = new DigitalInput(2);
        cubeLimit = new DigitalInput(3);

        driveEncoder = new Encoder(4, 5, false, Encoder.EncodingType.k4X);
        driveEncoder.reset();
        
        backTrigger = new DigitalInput(6);
        backTop = new DigitalInput(7);
        
        ultrasonic = new Ultrasonic(8,9);
        ultrasonic.setAutomaticMode(true);
        
        //Analog
        gyro = new AnalogGyro(0);
        
    }
}
