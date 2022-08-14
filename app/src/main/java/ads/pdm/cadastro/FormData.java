package ads.pdm.cadastro;

import android.text.Editable;

public class FormData {
    private String name;
    private String phone;
    private String email;
    private boolean choiceEmailList;
    private String gender;
    private String city;
    private String state;

    public FormData(String name, String phone,
                    String email, boolean choiceEmailList,
                    String gender, String city,
                    String state) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.choiceEmailList = choiceEmailList;
        this.gender = gender;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isChoiceEmailList() {
        return choiceEmailList;
    }

    public void setChoiceEmailList(boolean choiceEmailList) {
        this.choiceEmailList = choiceEmailList;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        String inEmailList = (choiceEmailList) ? "Sim" : "Não";
        return "Dados formulários : \n" +
                "Nome: " + name + "\n" +
                "Telefone: " + phone + "\n" +
                "Email: " + email + "\n" +
                "Incluído na lista de email : " + inEmailList + "\n" +
                "Sexo: " + gender + "\n" +
                "Cidade: " + city + "\n" +
                "Estado: " + state + "\n";
    }
}
