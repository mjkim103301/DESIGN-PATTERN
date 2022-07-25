package a11.proxy_pattern.rmi;

import java.rmi.Naming;

public class RmiTestDrive {
    public static void main(String[] args) {
        new RmiTestDrive().go();

    }

    public void go() {
        try {
            //MyRemote service = new MyRemoteImpl();
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            //Naming.rebind("RemoteHello", service);
            System.out.println(service.sayHello());
        } catch (Exception e) {
            System.out.println("rmi error: " + e);
            e.printStackTrace();
        }
    }
}
