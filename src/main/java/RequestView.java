import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestView {

    public static void main(String[] args) {

        // Mock-up user
        Map<String, String> userDB = new HashMap<String, String>();
        userDB.put("userId", "11");
        userDB.put("name", "Group Eleven");
        userDB.put("email", "group11asd@gmail.com");
        userDB.put("password", "123456");
        userDB.put("phoneNumber", "0000000");
        userDB.put("homeAddress", "Polacksbacken");
        userDB.put("rating", "10");
        userDB.put("state", "1");
        userDB.put("lat", "124.88");
        userDB.put("lon", "88.60");
        userDB.put("type", "requester");

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

        reqDetails.put("reqId", userDB.get("userId"));
        reqDetails.put("respId", "-1");
        reqDetails.put("state", "0");

        if (userDB.get("type").equals("responder")) {
            Responder user = new Responder((HashMap<String, String>) userDB);
        } else { //(userDB.get("type").equals("requester"))
            Requester user = new Requester((HashMap<String, String>) userDB);
            user.createRequest((HashMap<String, String>) reqDetails);

            if (user.issueRequest())
                System.out.println("Request issued successfully!");
            else
                System.out.println("Request issued failed!");
        }
    }
}