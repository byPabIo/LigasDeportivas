package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPartido;
    @Column
    private String fechaPartido;
    @Column
    private int golesLocal;
    @Column
    private int golesVisitante;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo idEquipoLocal;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo idEquipoVisitante;

    @ManyToOne
    @JoinColumn(name = "idliga")
    private Liga liga;

    public Partido(String fechaPartido, int golesLocal, int golesVisitante) {
        this.fechaPartido = fechaPartido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

}