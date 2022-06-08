package labtest.MockLabTest;

import java.util.Scanner;

public class SurveyRaya {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int totalParticipant = k.nextInt();
        String survey = "";
        int countYes = 0;
        int countNo = 0;

        for (int i = 0; i < totalParticipant; i++) {
            survey = k.next();

            if (survey.equals("yes")) {
                countYes++;
            }

            if (survey.equals("no")) {
                countNo++;
            }
        }

        if (countYes > countNo) {
            System.out.println("Study, study, study. Lab test lepas raya f2f. Jangan asyik main mercun. (Total yes="
                    + countYes + ")");
        } else if (countYes < countNo) {
            System.out
                    .println("Hooray merdeka. Lab test esok. Raya boleh fokus main mercun. (Total no=" + countNo + ")");
        } else {
            System.out.println("Ntah la");
        }
    }
}
