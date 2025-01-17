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

    public double IntakeRangex(double theta) {
        return intakeRange * Math.cos(Math.toRadians(theta));
    }

    public double IntakeRangey(double theta) {
        return intakeRange * Math.sin(Math.toRadians(theta));
    }

    public Vector IntakeRangeV(double theta, Vector orig) {
        return new Vector(orig.getXComponent() + (intakeRange * Math.cos(Math.toRadians(theta))), orig.getYComponent() + (intakeRange * Math.sin(Math.toRadians(theta))));
    }

    public double netPlacementRangex(double theta) {
        return netPlacementRange * Math.cos(Math.toRadians(theta));
    }

    public double netPlacementRangey(double theta) {
        return netPlacementRange * Math.sin(Math.toRadians(theta));
    }

    public Vector netPlacementRangeV(double theta, Vector orig) {
        return new Vector(orig.getXComponent() - (netPlacementRange * Math.cos(Math.toRadians(theta))), orig.getYComponent() - (netPlacementRange * Math.sin(Math.toRadians(theta))));
    }

    private final Vector ObsZoneStartV = new Vector(-24 + widthOffset,72 - lengthOffset);
    private final Pose ObsZoneStart = new Pose(ObsZoneStartV.getXComponent(), ObsZoneStartV.getYComponent(), Math.toRadians(270));  // Obs start

    private final Vector NetZoneStartV = new Vector(24 - widthOffset, 72 - lengthOffset);
    private final Pose NetZoneStart = new Pose(NetZoneStartV.getXComponent(), NetZoneStartV.getYComponent(), Math.toRadians(270)); // Net start


    private final Vector Specimen1V = new Vector((-6 + lengthOffset), (24 + placementRange));
    private final Pose Specimen1 = new Pose(Specimen1V.getXComponent(), Specimen1V.getYComponent(), Math.toRadians(270)); // Specimen1

    private final Vector Specimen2V = new Vector((-7.5 + lengthOffset), (24 + placementRange));
    private final Pose Specimen2 = new Pose(Specimen2V.getXComponent(), Specimen2V.getYComponent(), Math.toRadians(270)); // Specimen2

    private final Vector Specimen3V = new Vector((-9 + lengthOffset), (24 + placementRange));
    private final Pose Specimen3 = new Pose(Specimen3V.getXComponent(), Specimen3V.getYComponent(), Math.toRadians(270)); // Specimen3

    private final Vector Specimen4V = new Vector((-10.5 + lengthOffset), (24 + placementRange));
    private final Pose Specimen4 = new Pose(Specimen4V.getXComponent(), Specimen4V.getYComponent(), Math.toRadians(270)); // Specimen4

    private final Vector Specimen5V = new Vector((-12 + lengthOffset), (24 + placementRange));
    private final Pose Specimen5 = new Pose(Specimen5V.getXComponent(), Specimen5V.getYComponent(), Math.toRadians(270)); // Specimen5

    private final Vector NetSpecimenV = new Vector(10.5, 24 + placementRange);
    private final Pose NetSpecimen = new Pose(NetSpecimenV.getXComponent(), NetSpecimenV.getYComponent(), Math.toRadians(270)); // Net Specimen


    private final Vector NetDiagonalV = new Vector((72 - netPlacementRangex(45)), (72 - netPlacementRangey(45)));
    private final Pose NetDiagonal = new Pose(NetDiagonalV.getXComponent(), NetDiagonalV.getYComponent(), Math.toRadians(225)); // Net Diagonal

    private final Vector NetV = new Vector((55), (66));
    private final Pose Net = new Pose(NetV.getXComponent(), NetV.getYComponent(), Math.toRadians(225)); // Net


    private final Vector SpikeWallObsV = new Vector((-70), (25));
    private final Pose SpikeWallObs = new Pose(SpikeWallObsV.getXComponent(), SpikeWallObsV.getYComponent(), Math.toRadians(270)); // Obs Wall

    private final Vector SpikeMidObsV = new Vector((-60), (25));
    private final Pose SpikeMidObs = new Pose(SpikeMidObsV.getXComponent(), SpikeMidObsV.getYComponent(), Math.toRadians(270)); // Obs Mid

    private final Vector SpikeSubObsV = new Vector(-50, (25));
    private final Pose SpikeSubObs = new Pose(SpikeSubObsV.getXComponent(), SpikeSubObsV.getYComponent(), Math.toRadians(270)); // Obs Sub


    private final Vector SpikeWallNetV = new Vector((70), (25));
    private final Pose  SpikeWallNet = new Pose(SpikeWallNetV.getXComponent(), SpikeWallNetV.getYComponent(), Math.toRadians(270)); // Net Wall

    private final Vector SpikeMidNetV = new Vector((60), (25));
    private final Pose SpikeMidNet = new Pose(SpikeMidNetV.getXComponent(), SpikeMidNetV.getYComponent(), Math.toRadians(270)); // Net Mid

    private final Vector SpikeSubNetV = new Vector(50, (25));
    private final Pose SpikeSubNet = new Pose(SpikeSubNetV.getXComponent(), SpikeSubNetV.getYComponent(), Math.toRadians(270)); // Net Sub


    private final Vector SampleIntakeObsSubV = new Vector(-50, 25 + intakeRange);
    private final Pose SampleIntakeObsSub = new Pose(SampleIntakeObsSubV.getXComponent(), SampleIntakeObsSubV.getYComponent(), Math.toRadians(270)); // Obs Sub Intake

    private final Vector SampleIntakeObsMidV = new Vector(-60, 25 + intakeRange);
    private final Pose SampleIntakeObsMid = new Pose(SampleIntakeObsMidV.getXComponent(), SampleIntakeObsMidV.getYComponent(), Math.toRadians(270)); // Obs Mid Intake

    private final Vector SampleIntakeObsWallV = new Vector(IntakeRangex(240) - 70, IntakeRangey(240) + 25);
    private final Pose SampleIntakeObsWall = new Pose(SampleIntakeObsWallV.getXComponent(), SampleIntakeObsWallV.getYComponent(), Math.toRadians(240)); // Obs Wall Intake


    private final Vector SampleIntakeNetSubV = new Vector(50, 25 + intakeRange);
    private final Pose SampleIntakeNetSub = new Pose(SampleIntakeNetSubV.getXComponent(), SampleIntakeNetSubV.getYComponent(), Math.toRadians(270)); // Net Sub Intake

    private final Vector SampleIntakeNetMidV = new Vector(60, 25 + intakeRange);
    private final Pose SampleIntakeNetMid = new Pose(SampleIntakeNetMidV.getXComponent(), SampleIntakeNetMidV.getYComponent(), Math.toRadians(270)); // Net Mid Intake

    private final Vector SampleIntakeNetWallV = new Vector(70 - IntakeRangex(300), 25 - IntakeRangey(300));
    private final Pose SampleIntakeNetWall = new Pose(SampleIntakeNetWallV.getXComponent(), SampleIntakeNetWallV.getYComponent(), Math.toRadians(300)); // Net Wall Intake


    private final Vector SampleDropSubV = new Vector(-50, 72 - placementRange);
    private final Pose SampleDropSub = new Pose(SampleDropSubV.getXComponent(), SampleDropSubV.getYComponent(), Math.toRadians(270)); // Sub Drop

    private final Vector SampleDropMidV = new Vector(-60, 72 - placementRange);
    private final Pose SampleDropMid = new Pose(SampleDropMidV.getXComponent(), SampleDropMidV.getYComponent(), Math.toRadians(270)); // Mid Drop

    private final Vector SampleDropWallV = new Vector(-70, 72 - placementRange);
    private final Pose SampleDropWall = new Pose(SampleDropWallV.getXComponent(), SampleDropWallV.getYComponent(), Math.toRadians(270)); // Wall Drop


    private final Vector SamplePickupNetV = new Vector((24), (-2 - widthOffset));
    private final Pose SamplePickupNet = new Pose(SamplePickupNetV.getXComponent(), SamplePickupNetV.getYComponent(), Math.toRadians(180)); // Net Pickup

    private final Vector SamplePickupObsV = new Vector((-24), (2 + widthOffset));
    private final Pose SamplePickupObs = new Pose(SamplePickupObsV.getXComponent(), SamplePickupObsV.getYComponent(), Math.toRadians(0)); // Obs Pickup

    private final Vector ObsZoneV = new Vector((-55), (66 - widthOffset));
    private final Pose ObsZone = new Pose(ObsZoneV.getXComponent(), ObsZoneV.getYComponent(), Math.toRadians(270)); // Obs Zone

    private final Vector ObsZoneIntakeV = new Vector((55), (-66 + intakeRange));
    private final Pose ObsZoneIntake = new Pose(ObsZoneIntakeV.getXComponent(), ObsZoneIntakeV.getYComponent(), Math.toRadians(270)); // Obs Intake






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

