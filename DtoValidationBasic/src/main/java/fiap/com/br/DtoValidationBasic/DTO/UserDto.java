package fiap.com.br.DtoValidationBasic.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres")
    private String nome;

    // construtor padrão (obrigatório para frameworks como Spring)
    public UserDto() {
    }

    // construtor com argumento
    public UserDto(String nome) { this.nome = nome; }

    // getter
    public String getNome() { return nome; }

    // setter
    public void setNome(String nome) { this.nome = nome; }

    // opcional: para debug
    @Override
    public String toString() {
        return "UserDto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}