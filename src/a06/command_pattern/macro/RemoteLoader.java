package a06.command_pattern.macro;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");

        /**
         * 람다를 사용하지 않은 방식
         */
//        LightOnCommand livingRoomLightOn =
//                new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff =
//                new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn =
//                new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff =
//                new LightOffCommand(kitchenLight);
//
//
//        GarageDoorUpCommand garageDoorUp =
//                new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown =
//                new GarageDoorDownCommand(garageDoor);
//
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);

        remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remoteControl.setCommand(2, () -> garageDoor.up(), () -> garageDoor.down());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
