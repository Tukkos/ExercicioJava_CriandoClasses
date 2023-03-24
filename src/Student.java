public class Student {
    private String name;
    private String cpf;
    private String email;
    Subject subject = new Subject();

    public void setCPF(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Favor inserir somente os numeros do cpf");
        }
    }

    public String getCPF() {
        return this.cpf;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }


    public void setName(String name) {
        if (name.length() > 10) {
            this.name = name;
        } else {
            System.out.println("Favor inserir seu nome completo");
        }
    }

    public String getName() {
        return name;
    }

    
}
