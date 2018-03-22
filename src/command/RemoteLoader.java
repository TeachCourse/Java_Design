package command;

import command.impl.CeilingFanHighCommand;
import command.impl.CeilingFanMediumCommand;
import command.impl.CeilingFanOffCommand;
import command.impl.CeilingFanOnCommand;
import command.impl.GarageDoorDownCommand;
import command.impl.GarageDoorUpCommand;
import command.impl.LightOffCommand;
import command.impl.LightOnCommand;
import command.impl.MacroCommand;
import command.impl.StereoOffWithCDCommand;
import command.impl.StereoOnWithCDCommand;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(
				livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(
				ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(
				ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(
				ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(
				garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(
				stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

		remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(6, ceilingFanHigh, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.toString();
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		remoteControl.undoButterWasPushed();

		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);
		remoteControl.undoButterWasPushed();

		
		Command[] partyOn = { livingRoomLightOn, kitchenLightOn, ceilingFanOn,
				garageDoorUp, stereoOnWithCD };
		Command[] partyOff = { livingRoomLightOff, kitchenLightOff,
				ceilingFanOff, garageDoorDown, stereoOffWithCD };

		MacroCommand partyOnMarcro = new MacroCommand(partyOn);
		MacroCommand partyOffMarcro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMarcro, partyOffMarcro);
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButterWasPushed();
	}
}
