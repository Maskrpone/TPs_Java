public class Technician {
    final private String firstname;
    final private String surname;
    final private String birthDate;
    final private String numberPhone;
    final private String Id;
    final private int salary;
    private boolean medicalExam;

    public Technician() {
        this.Id = "Null";
        this.firstname = "Null";
        this.surname = "Null";
        this.birthDate = "Null";
        this.numberPhone = "Null";
        this.salary = 0;
        this.medicalExam = false;
    }

    public Technician(String id, String firstname, String surname, String birthDate, String numberPhone, int salary, boolean medicalExam) {
        this.Id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.birthDate = birthDate;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.medicalExam = medicalExam;
    }

    final public String getFirstname() {
        return this.firstname;
    }
    final public String getSurname() {
        return this.surname;
    }
    final public String getBirthDate() {
        return this.birthDate;
    }
    final public String getNumberPhone() {
        return this.numberPhone;
    }
    final public String getId() {
        return this.Id;
    }
    final public int getSalary() {
        return this.salary;
    }
    final public boolean isValid() {
        return this.medicalExam;
    }

    public void setMedicalExam(boolean value) {
        this.medicalExam = value;
    }

    public void checkInfos() {
        System.out.println("Firstname: " + this.firstname);
        System.out.println("Surname: " + this.surname);
        System.out.println("Birth date: " + this.birthDate);
        System.out.println("Number phone: " + this.numberPhone);
        System.out.println("Id: " + this.Id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Medical exam: " + this.medicalExam);
        System.out.println("--------------------");
    }
}
