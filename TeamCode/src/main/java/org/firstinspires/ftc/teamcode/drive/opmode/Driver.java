package org.firstinspires.ftc.teamcode.drive.opmode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Config
@TeleOp(group = "drive")
public class Driver extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            double leftpower;
            double rightpower;
            double drivespeed;


            double drive = -gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;

            leftpower = Range.clip(drive + turn, -1.0, 1.0);
            rightpower = Range.clip(drive - turn, -1.0, 1.0);

            // finsih later
        }
    }


}
