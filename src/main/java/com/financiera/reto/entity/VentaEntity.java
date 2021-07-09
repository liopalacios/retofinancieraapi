package com.financiera.reto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "venta")
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity idCliente;

    private Date fecha;

    @OneToMany(mappedBy = "idVenta", cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<DetalleVentaEntity> detailsSale;

    private Double total;
}
