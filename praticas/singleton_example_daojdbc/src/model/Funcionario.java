package model;

public class Funcionario {
    private int    id;
    private String nome;
    private String address;
  
    public Funcionario() {}
  
    public Funcionario(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }
  
    public int getId()
    {
        return this.id;
    }
  
    public void setId(int id)
    {
        this.id = id;
    }
  
    public String getNome()
    {
        return this.nome;
    }
  
    public void setNome(String nome)
    {
        this.nome = nome;
    }
  
    public String getAddress()
    {
        return this.address;
    }
  
    public void setAddress(String address)
    {
        this.address = address;
    }
  
    @Override
    public String toString()
    {
        return "Funcionario [id=" + id + ", nome=" + nome + ", address=" + address + "]";
    }
}
