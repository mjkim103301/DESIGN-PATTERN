package a08.template_method_pattern.hook;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("차에 레몬을 넣을까요? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
