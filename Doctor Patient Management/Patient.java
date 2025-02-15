class Patient extends User{
private String patientName;

public Patient(int userId, String email, String password, String patientName){
    super(userId, email,password);
    this.patientName = patientName;
}



public boolean authentication(){
    return true;
}

}
