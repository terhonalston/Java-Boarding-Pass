import java.util.Scanner;

public class Ticket {
        Scanner scanner= new Scanner(System.in);

        String inputName;
        String inputEmail;
        String inputPhone;
        String inputGender;
        String inputAge;
        String inputPass;
        String inputDate ;
        String inputOrigin;
        String inputDest;
        String inputETA;
        String inputDeparture;
        public Ticket(){

        }

        public Ticket(String inputName, String inputEmail, String inputPhone, String inputGender,
                      String inputAge, String inputPass, String inputDate, String inputOrigin, String inputDest,
                      String inputETA, String inputDeparture) {
                this.inputName = inputName;
                this.inputEmail = inputEmail;
                this.inputPhone = inputPhone;
                this.inputGender = inputGender;
                this.inputAge = inputAge;
                this.inputPass = inputPass;
                this.inputDate = inputDate;
                this.inputOrigin = inputOrigin;
                this.inputDest = inputDest;
                this.inputETA = inputETA;
                this.inputDeparture = inputDeparture;
        }

        public String getInputName() {
                return inputName;
        }

        public void setInputName(String inputName) {
                this.inputName = inputName;
        }

        public String getInputEmail() {
                return inputEmail;
        }

        public void setInputEmail(String inputEmail) {
                this.inputEmail = inputEmail;
        }

        public String getInputPhone() {
                return inputPhone;
        }

        public void setInputPhone(String inputPhone) {
                this.inputPhone = inputPhone;
        }

        public String getInputGender() {
                return inputGender;
        }

        public void setInputGender(String inputGender) {
                this.inputGender = inputGender;
        }

        public String getInputAge() {
                return inputAge;
        }

        public void setInputAge(String inputAge) {
                this.inputAge = inputAge;
        }

        public String getInputPass() {
                return inputPass;
        }

        public void setInputPass(String inputPass) {
                this.inputPass = inputPass;
        }

        public String getInputDate() {
                return inputDate;
        }

        public void setInputDate(String inputDate) {
                this.inputDate = inputDate;
        }

        public String getInputOrigin() {
                return inputOrigin;
        }

        public void setInputOrigin(String inputOrigin) {
                this.inputOrigin = inputOrigin;
        }

        public String getInputDest() {
                return inputDest;
        }

        public void setInputDest(String inputDest) {
                this.inputDest = inputDest;
        }

        public String getInputETA() {
                return inputETA;
        }

        public void setInputETA(String inputETA) {
                this.inputETA = inputETA;
        }

        public String getInputDeparture() {
                return inputDeparture;
        }

        public void setInputDeparture(String inputDeparture) {
                this.inputDeparture = inputDeparture;
        }
}
