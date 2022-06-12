package a06.command_pattern.simple;

public class RemoteControlTest {
	public static void main(String[] args) {
		//종업원
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		//주문서
		LightOnCommand lightOn = new LightOnCommand(light);

		//종업원이 주문을 받는다.
		remote.setCommand(lightOn);
		//주방장이 주문을 수행한다.
		remote.buttonWasPressed();
    }
}
