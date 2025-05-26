package dev.andrefelix.CadastroDeClientes.Clientes;

import dev.andrefelix.CadastroDeClientes.Servicos.ServicosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "servicos_id")
    private ServicosModel servicos;


}
