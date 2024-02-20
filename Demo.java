import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws NumberFormatException, IOException {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.newVideoUploaded("Learn Design Patterns");
        channel.newVideoUploaded("New Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                // new video upload code
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);

            } else if (c == 2) {
                // create new subscriber
                System.out.println("Enter the name of subscriber");
                String subscriberName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subscriberName);
                channel.subscribe(subscriber3);

            } else if (c == 3) {
                System.err.println("Thankyou for using app");
                break;
            } else {
                // exit wrong input
                System.err.println("Wrong input");
            }

        }

    }
}
