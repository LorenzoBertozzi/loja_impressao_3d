package projetofinal;

public abstract class Usuario
{
    private String nomeUsuario;
    private String cpfUsuario;
    private String eMail;
    private String telefone;
    private String senha;

    Usuario()
    {
    }
    
    Usuario (String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha)
    {
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getCpfUsuario() {
        return cpfUsuario;
    }
    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }
    /*static boolean isCpf (String cpf)
    {

        return false;

    }*/
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    /*static boolean isEmail (String eMail)
    {

        return false;

    }*/
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /*static boolean isSenha (String senha)
    {

        return false;

    }*/

}
