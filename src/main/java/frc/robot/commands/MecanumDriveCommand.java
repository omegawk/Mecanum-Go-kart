package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MecanumDrivetrainsubsystem;

public class MecanumDriveCommand extends Command{
    private final Supplier<Double> xSupplier, ySupplier, zSupplier;


    private final MecanumDrivetrainsubsystem drivesubsytem;

    public MecanumDriveCommand(MecanumDrivetrainsubsystem drivesubsystem,Supplier<Double> xSupplier,Supplier<Double> ySupplier,Supplier<Double> zSupplier){    
        this.drivesubsytem = drivesubsystem;
        addRequirements(drivesubsystem);
    }
@Override
public void initialize(){

}

@Override
public void execute(){

}
@Override
public void end(boolean interrupted){

}

@Override
public boolean isFinished(){
    return false;
}
}