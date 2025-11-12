class Doctor {
    void consultationFee() {
        System.out.println("Doctor's consultation fee.");
    }
}

class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹500");
    }
}

class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹1000");
    }
}

class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹1500");
    }
}

public class MedicalFeesDemo {
    public static void main(String[] args) {
        Doctor doc;
        
        doc = new Dentist();
        doc.consultationFee();

        doc = new Cardiologist();
        doc.consultationFee();

        doc = new Surgeon();
        doc.consultationFee();
    }
}
