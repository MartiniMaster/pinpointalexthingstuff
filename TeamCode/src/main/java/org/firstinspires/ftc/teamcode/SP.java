package org.firstinspires.ftc.teamcode;

import com.pedropathing.localization.Pose;
import com.pedropathing.pathgen.Vector;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import java.lang.annotation.Annotation;


@Autonomous (name = "SP", group = "Autonomous")
public class SP implements Autonomous {

    public static double widthOffset = 7.5;
    public static double lengthOffset = 8.5;
    public static double placementRange = lengthOffset + 1;
    public static double intakeRange = lengthOffset + 1;
    public static double netPlacementRange = lengthOffset + 3;
    public static double specPickupRange = lengthOffset + 7;

    public static double IntakeRangex(double theta) {
        return intakeRange * Math.cos(Math.toRadians(theta));
    }

    public static double IntakeRangey(double theta) {
        return intakeRange * Math.sin(Math.toRadians(theta));
    }

    public Vector IntakeRangeV(double theta, Vector orig) {
        return new Vector(orig.getXComponent() + (intakeRange * Math.cos(Math.toRadians(theta))), orig.getYComponent() + (intakeRange * Math.sin(Math.toRadians(theta))));
    }

    public static double netPlacementRangex(double theta) {
        return netPlacementRange * Math.cos(Math.toRadians(theta));
    }

    public static double netPlacementRangey(double theta) {
        return netPlacementRange * Math.sin(Math.toRadians(theta));
    }

    public Vector netPlacementRangeV(double theta, Vector orig) {
        return new Vector(orig.getXComponent() - (netPlacementRange * Math.cos(Math.toRadians(theta))), orig.getYComponent() - (netPlacementRange * Math.sin(Math.toRadians(theta))));
    }

    public static final Pose ObsZoneStart = new Pose(48 + widthOffset, 143 - lengthOffset, Math.toRadians(270));  // Obs start

    public static final Pose NetZoneStart = new Pose(96 - widthOffset, 143 - lengthOffset, Math.toRadians(270)); // Net start


    public static final Pose Specimen1 = new Pose(66 + lengthOffset, 96 + placementRange, Math.toRadians(270)); // Specimen1

    public static final Pose Specimen2 = new Pose(64.5 + lengthOffset, 96 + placementRange, Math.toRadians(270)); // Specimen2

    public static final Pose Specimen3 = new Pose(63 + lengthOffset, 96 + placementRange, Math.toRadians(270)); // Specimen3

    public static final Pose Specimen4 = new Pose(61.5 + lengthOffset, 96 + placementRange, Math.toRadians(270)); // Specimen4

    public static final Pose Specimen5 = new Pose(60 + lengthOffset, 96 + placementRange, Math.toRadians(270)); // Specimen5

    public static final Pose NetSpecimen = new Pose(82.5, 96 + placementRange, Math.toRadians(270)); // Net Specimen


    public static final Pose NetDiagonal = new Pose(144 - netPlacementRangex(45), 144 - netPlacementRangey(45), Math.toRadians(225)); // Net Diagonal

    public static final Pose Net = new Pose(127, 138, Math.toRadians(225)); // Net


    public static final Pose SpikeWallObs = new Pose(2, 97, Math.toRadians(270)); // Obs Wall

    public static final Pose SpikeMidObs = new Pose(12, 97, Math.toRadians(270)); // Obs Mid

    public static final Pose SpikeSubObs = new Pose(22, 97, Math.toRadians(270)); // Obs Sub


    public static final Pose  SpikeWallNet = new Pose(142, 97, Math.toRadians(270)); // Net Wall

    public static final Pose SpikeMidNet = new Pose(132, 97, Math.toRadians(270)); // Net Mid

    public static final Pose SpikeSubNet = new Pose(122, 97, Math.toRadians(270)); // Net Sub


    public static final Pose SampleIntakeObsSub = new Pose(22, 97 + intakeRange, Math.toRadians(270)); // Obs Sub Intake

    public static final Pose SampleIntakeObsMid = new Pose(12, 97 + intakeRange, Math.toRadians(270)); // Obs Mid Intake

    public static final Pose SampleIntakeObsWall = new Pose(IntakeRangex(240) + 2, IntakeRangey(240) + 97, Math.toRadians(240)); // Obs Wall Intake

    public static final Pose SampleIntakeNetSub = new Pose(122, 97 + intakeRange, Math.toRadians(270)); // Net Sub Intake

    public static final Pose SampleIntakeNetMid = new Pose(132, 97 + intakeRange, Math.toRadians(270)); // Net Mid Intake

    public static final Pose SampleIntakeNetWall = new Pose(142 - IntakeRangex(300), 97 - IntakeRangey(300), Math.toRadians(300)); // Net Wall Intake


    public static final Pose SampleDropSub = new Pose(22, 144 - placementRange, Math.toRadians(270)); // Sub Drop

    public static final Pose SampleDropMid = new Pose(12, 144 - placementRange, Math.toRadians(270)); // Mid Drop

    public static final Pose SampleDropWall = new Pose(2, 144 - placementRange, Math.toRadians(270)); // Wall Drop


    public static final Pose SamplePickupNet = new Pose(96, 70 - widthOffset, Math.toRadians(180)); // Net Pickup

    public static final Pose SamplePickupObs = new Pose(48, 74 + widthOffset, Math.toRadians(0)); // Obs Pickup

    public static final Pose ObsZone = new Pose(17, 138 - widthOffset, Math.toRadians(270)); // Obs Zone

    public static final Pose ObsZoneIntake = new Pose(127, 6 + intakeRange, Math.toRadians(270)); // Obs Intake






    @Override
    public String name() {
        return "";
    }

    @Override
    public String group() {
        return "";
    }

    @Override
    public String preselectTeleOp() {
        return "";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

