package dev.andrefelix.CadastroDeClientes.Servicos;

import dev.andrefelix.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_servicos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    @OneToMany(mappedBy = "servicos")
    private ClienteModel cliente;


}
