import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequesterView {

    public static void main(String[] args) {

        // Mock-up user
        UserDB userDB = new UserDB();
        userDB.type = "requester";

        final Map<String, String> reqDetails = new HashMap<String, String>();

        // Request inputs
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter duration: ");
        reqDetails.put("duration", input1.next());

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter urgency: ");
        reqDetails.put("urgency", input2.next());

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter time constraint: ");
        reqDetails.put("timeConstraint", input3.next());

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter description: ");
        reqDetails.put("description", input4.next());

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter price: ");
        reqDetails.put("price", input5.next());

        Scanner input6 = new Scanner(System.in);
        System.out.println("Enter payment type: ");
        reqDetails.put("payType", input6.next());

        reqDetails.put("reqId", Integer.toString(userDB.userId));
        reqDetails.put("respId", "-1");
        reqDetails.put("state", "0");

        if (userDB.type.equals("responder")) {
            Responder user = new Responder(userDB);
        } else { //(userDB.get("type").equals("requester"))
            Requester user = new Requester(userDB);
            user.createRequest((HashMap<String, String>) reqDetails);

            if (user.issueRequest())
                System.out.println("Request issued successfully!");
            else
                System.out.println("Request issued failed!");
        }
    }
}