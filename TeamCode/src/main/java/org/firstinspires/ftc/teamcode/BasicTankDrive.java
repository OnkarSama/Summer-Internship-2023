package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTankDrive", group = "TeleOp")
public class BasicTankDrive extends LinearOpMode {

    public Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {


        robot.init(hardwareMap);   // Put hardwareMap below.

        // Put initialization blocks here.

        waitForStart();

        if(opModeIsActive()){
            // Put run blocks here.
            while(opModeIsActive()){
                // Put loop blocks here.
            }
        }

    }
}
